package challenges.flights;

public class Application {

    public static void main(String[] args) {

        FlightScanner flightScanner = new FlightScanner();
        flightScanner.printFlights(flightScanner.findArrivalFlights("Gdańsk"));
        flightScanner.printFlights(flightScanner.findDeparturesFlights("Wrocław"));
        flightScanner.findIndirectFlights("Gdańsk", "Wrocław", "Toruń");
    }
}
