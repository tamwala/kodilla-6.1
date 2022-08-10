package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlightScannerTestSuite {

    @Test
    public void testFindOneFlight() {

        //Given
        Flight flight = new Flight("Gdańsk", "Warszawa");
        FlightScanner flightScanner = new FlightScanner();
        flightScanner.getAvailableFlights().put("Warszawa", true);
        flightScanner.getAvailableFlights().put("Poznań", false);

        //When & Then
        assertDoesNotThrow(() -> flightScanner.findFlight(flight));

    }

    @Test
    public void testFindZeroFlight() {

        //Given
        Flight flight = new Flight("Gdańsk", "Kraków");
        FlightScanner flightScanner = new FlightScanner();
        flightScanner.getAvailableFlights().put("Warszawa", true);
        flightScanner.getAvailableFlights().put("Poznań", false);

        //When & Then
        assertThrows(RouteNotFoundException.class, () -> flightScanner.findFlight(flight));

    }

}
