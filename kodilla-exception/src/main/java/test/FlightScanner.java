package test;

import com.example.io.FileReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightScanner {

    Map<String, Boolean> availableFlights = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException{

        List<Boolean> searchedFlight = availableFlights.entrySet().stream()
                .filter(e -> e.getKey().equals(flight.arrivalAirport))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        if (searchedFlight.isEmpty()) {
            throw new RouteNotFoundException();
        } else {
            System.out.println(searchedFlight);
        }
    }
}
