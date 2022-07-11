package test;

import java.util.HashMap;
import java.util.Map;

public class FlightScanner {

    private Map<String, Boolean> availableFlights = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Boolean isAvailable = availableFlights.get(flight.getArrivalAirport());

        if (isAvailable != null && isAvailable == true) {
            System.out.println("Arrival airport is available");
        } else if (isAvailable != null && isAvailable == false) {
            System.out.println("Not available");
        } else {
            throw new RouteNotFoundException();
        }
    }

    public Map<String, Boolean> getAvailableFlights() {
        return availableFlights;
    }

    public void setAvailableFlights(String arrivalAirport, boolean available) {
        availableFlights.put(arrivalAirport, available);
    }
}
