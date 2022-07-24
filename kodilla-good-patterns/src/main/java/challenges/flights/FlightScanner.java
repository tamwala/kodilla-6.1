package challenges.flights;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightScanner {
    FlightsContainer flightsContainer = new FlightsContainer();

    HashSet<Flight> allAirports = flightsContainer.populateAirports();

    public Set<String> findArrivalFlights(String departure) {
        Set<String> flights = allAirports.stream()
                .filter(e -> e.getDeparture().equals(departure))
                .flatMap(e -> e.getArrival().stream())
                .collect(Collectors.toSet());

        return flights;
    }

    public Set<String> findDeparturesFlights(String arrival) {
        Set<String> flights = allAirports.stream()
                .filter(e -> e.getArrival().contains(arrival))
                .map(e -> e.getDeparture())
                .collect(Collectors.toSet());

        return flights;
    }

    public void findIndirectFlights(String departure, String arrival, String midlanding) {
        Set<String> arrivals = findArrivalFlights(departure);
        Set<String> departures = findDeparturesFlights(arrival);

        Set<String> intersectSet = new HashSet<>(arrivals);
        intersectSet.retainAll(departures);

        if (intersectSet.contains(midlanding)) {
            System.out.println("Flight connection is available");
        } else {
            System.out.println("Flight connection is not available");
        }
    }

    public void printFlights(Set flights) {
        System.out.println(flights);
    }
}
