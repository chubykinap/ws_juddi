package juddi.service;

import org.apache.juddi.v3.client.config.UDDIClerk;
import org.apache.juddi.v3.client.config.UDDIClient;
import org.uddi.api_v3.BusinessEntity;
import org.uddi.api_v3.BusinessService;

public class JUDDISearch {
    public void search() throws Exception {

        UDDIClient uddiClient = new UDDIClient("META-INF/wsdl2uddi-uddi.xml");
        UDDIClerk clerk = uddiClient.getClerk("jumble");

        BusinessEntity businessEntity =
                clerk.findBusiness("uddi:uddi.jumblepublisher.com:business_flight");
        if (businessEntity != null) {
            System.out.println("Found business with name " + businessEntity.getName().get(0).getValue());
            System.out.println("Key: " + businessEntity.getBusinessKey());
            System.out.println("Number of services: " + businessEntity.getBusinessServices().getBusinessService().size());

            for (BusinessService businessService : businessEntity.getBusinessServices().getBusinessService()) {
                System.out.println("Service Name        = '" + businessService.getName().get(0).getValue() + "'");
                System.out.println("Service Key         = '" + businessService.getServiceKey() + "'");
                System.out.println("Service Description = '" + businessService.getDescription().get(0).getValue() + "'");
            }
        }
    }
}
