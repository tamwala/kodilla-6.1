package challenges.flights;

import java.util.HashSet;

public class FlightsContainer {

    public HashSet<Flight> populateAirports() {

        HashSet<Flight> allAirports = new HashSet<>();

        HashSet<String> availableFlights = new HashSet<>();
        availableFlights.add("Warszawa");
        availableFlights.add("Toruń");
        Flight flight = new Flight("Gdańsk", availableFlights);

        HashSet<String> availableFlights1 = new HashSet<>();
        availableFlights1.add("Poznań");
        availableFlights1.add("Wrocław");
        Flight flight1 = new Flight("Toruń", availableFlights1);

        allAirports.add(flight);
        allAirports.add(flight1);

        return allAirports;
    }
}






