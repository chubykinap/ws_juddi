package juddi.service;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.juddi.api_v3.Publisher;
import org.apache.juddi.api_v3.SavePublisher;
import org.apache.juddi.v3.client.config.UDDIClerk;
import org.apache.juddi.v3.client.config.UDDIClient;
import org.apache.juddi.v3.client.transport.TransportException;
import org.apache.juddi.v3_service.JUDDIApiPortType;
import org.uddi.api_v3.*;
import org.uddi.v3_service.DispositionReportFaultMessage;
import org.uddi.v3_service.UDDISecurityPortType;

import javax.xml.ws.Endpoint;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class JUDDIPublish {
    static UDDIClient uddiClient;

    public void publish() {
        try {
            Endpoint endpoint = Endpoint.create(new FlightServiceImp());
            endpoint.publish("http://localhost:8081/service/FlightService");
            uddiClient = new UDDIClient("META-INF/wsdl2uddi-uddi.xml");
            UDDIClerk clerk = uddiClient.getClerk("jumble");

            setupPublisher(clerk);

            publishBusiness(clerk);

            publishWSDL(clerk);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void publishBusiness(UDDIClerk clerk) {
        BusinessEntity myBusEntity = new BusinessEntity();
        Name myBusName = new Name();
        myBusName.setValue("Flight Business");
        myBusEntity.getName().add(myBusName);
        myBusEntity.setBusinessKey("uddi:uddi.jumblepublisher.com:business_flight");
        clerk.register(myBusEntity);
    }

    public void publishWSDL(UDDIClerk clerk) throws MalformedURLException {
        clerk.registerWsdls(new URL("http://localhost:8081"));
    }

    private void setupPublisher(UDDIClerk clerk) throws DispositionReportFaultMessage, RemoteException, ConfigurationException, TransportException {

        UDDISecurityPortType security = uddiClient.getTransport("default").getUDDISecurityService();

        GetAuthToken getAuthTokenRoot = new GetAuthToken();
        getAuthTokenRoot.setUserID("root");
        getAuthTokenRoot.setCred("");
        // Making API call that retrieves the authentication token for the 'root' user.
        AuthToken rootAuthToken = security.getAuthToken(getAuthTokenRoot);
        //Creating joe publisher THIS IS JUDDI Specific code
        JUDDIApiPortType juddiApi = uddiClient.getTransport("default").getJUDDIApiService();
        Publisher p = new Publisher();
        p.setAuthorizedName("jumblepublisher");
        p.setPublisherName("Jumble");
        // Adding the publisher to the "save" structure, using the 'root' user authentication info and saving away.
        SavePublisher sp = new SavePublisher();
        sp.getPublisher().add(p);
        sp.setAuthInfo(rootAuthToken.getAuthInfo());
        juddiApi.savePublisher(sp);
        //END jUDDI specific code

        //Every publisher should have a keyGenerator, Joe has his:
        TModel keyGenerator = new TModel();
        keyGenerator.setTModelKey("uddi:uddi.jumblepublisher.com:keygenerator");
        Name name = new Name();
        name.setValue("Jumble's Key Generator");
        keyGenerator.setName(name);
        Description description = new Description();
        description.setValue("This is the key generator for Jumble's UDDI entities!");
        keyGenerator.getDescription().add(description);
        OverviewDoc overviewDoc = new OverviewDoc();
        OverviewURL overviewUrl = new OverviewURL();
        overviewUrl.setUseType("text");
        overviewUrl.setValue("http://uddi.org/pubs/uddi_v3.htm#keyGen");
        overviewDoc.setOverviewURL(overviewUrl);
        keyGenerator.getOverviewDoc().add(overviewDoc);
        CategoryBag categoryBag = new CategoryBag();
        KeyedReference keyedReference = new KeyedReference();
        keyedReference.setKeyName("uddi-org:types:keyGenerator");
        keyedReference.setKeyValue("keyGenerator");
        keyedReference.setTModelKey("uddi:uddi.org:categorization:types");
        categoryBag.getKeyedReference().add(keyedReference);
        keyGenerator.setCategoryBag(categoryBag);
        clerk.register(keyGenerator);
    }
}
