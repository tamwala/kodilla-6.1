package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 5;
        int b = 2;

        int resultAddition = calculator.addition(a,b);
        int resultSubtraction = calculator.subtraction(a, b);

        int expectedAddition = a + b;
        int expectedSubtraction = a - b;

        if (resultAddition == expectedAddition) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }


        if (resultSubtraction == expectedSubtraction) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

    }
}
