package test;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class FlightScannerRunner {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj nazwę lotniska z którego chcesz lecieć");
        String userInput1 = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj nazwę lotniska do którego chcesz lecieć");
        String userInput2 = scanner2.nextLine();

        Flight fligh = new Flight(userInput1, userInput2);

        FlightScanner flightScanner = new FlightScanner();
        flightScanner.getAvailableFlights().put("Warszawa", true);
        flightScanner.getAvailableFlights().put("Poznań", false);

        try {
            flightScanner.findFlight(fligh);
        } catch (RouteNotFoundException e) {
            System.out.println("error");
        }

    }
}
