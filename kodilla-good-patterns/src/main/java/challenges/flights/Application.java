package challenges.flights;

public class Application {

    public static void main(String[] args) {

        FlightScanner flightScanner1 = new FlightScanner();
        flightScanner1.printFlights(flightScanner1.findArrivalFlights("Gdańsk"));
        flightScanner1.printFlights(flightScanner1.findDeparturesFlights("Wrocław"));
        flightScanner1.findIndirectFlights("Gdańsk", "Wrocław", "Toruń");
    }
}
