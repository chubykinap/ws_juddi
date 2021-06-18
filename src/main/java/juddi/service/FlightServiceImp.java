package juddi.service;

import juddi.client.Flight;
import juddi.client.FlightService;
import juddi.client.SQLTransactionException;

import java.util.List;

public class FlightServiceImp implements FlightService {
    @Override
    public List<Flight> getFlights(String arg0) throws SQLTransactionException {
        return null;
    }

    @Override
    public String changeFlight(String arg0) throws SQLTransactionException {
        return null;
    }

    @Override
    public String deleteFlight(int arg0) throws SQLTransactionException {
        return null;
    }

    @Override
    public int addFlight(String arg0) throws SQLTransactionException {
        return 0;
    }
}
