package test;

import java.util.Set;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(10, 1.5);
        } catch (Exception e) {
            System.out.println("Please enter correct values");
        } finally {
            System.out.println("Thank you for participating!");
        }
    }
}
