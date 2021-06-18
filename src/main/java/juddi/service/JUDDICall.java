package juddi.service;

import juddi.client.Flight;
import juddi.client.FlightService;
import juddi.client.FlightService_Service;
import org.apache.juddi.v3.client.config.UDDIClerk;
import org.apache.juddi.v3.client.config.UDDIClient;
import org.apache.juddi.v3.client.mapping.ServiceLocator;

import javax.xml.ws.BindingProvider;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class JUDDICall {
    public void call() throws Exception {
        UDDIClient uddiClient = new UDDIClient("META-INF/wsdl2uddi-uddi.xml");
        UDDIClerk clerk = uddiClient.getClerk("jumble");

        String helloWorldServiceKey = "uddi:uddi.jumblepublisher.com:service_flightservice";

        ServiceLocator serviceLocator = new ServiceLocator(clerk);

        serviceLocator.withLiveCache(new URL("http://localhost:18079"));

        //String endpoint = serviceLocator.lookupEndpoint(helloWorldServiceKey);

        String endpoint2 = serviceLocator.lookupEndpoint(helloWorldServiceKey);

        FlightService_Service helloWorldService = new FlightService_Service();
        FlightService flightService = helloWorldService.getFlightServicePort();
        Map<String, Object> requestContext = ((BindingProvider) flightService).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint2);
        printReply(flightService.getFlights(""));
        Thread.sleep(10l);
        serviceLocator.shutdown();
    }

    private void printReply(List<Flight> flights) {
        for (Flight flight : flights) {
            System.out.println("Рейс " + flight.getFlightNumber() +
                    " из города " + flight.getDepartureCity() +
                    " в город " + flight.getArrivalCity() +
                    " вылет " + flight.getDepartureDate());
        }
    }
}
