package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAddCalculation() {
        //Given
        //When
        double result = calculator.add(1, 2);
        double expectedResult = 3;

        //Then
        assertEquals(result, expectedResult);
    }

    @Test
    void testSubtractCalculation() {
        //Given
        //When
        double result = calculator.sub(7, 3);
        double expectedResult = 4;

        //Then
        assertEquals(result, expectedResult);
    }

    @Test
    void testMultiplyCalculation() {
        //Given
        //When
        double result = calculator.mul(8, 9);
        double expectedResult = 72;

        //Then
        assertEquals(result, expectedResult);
    }

    @Test
    void testDivideCalculation() {
        //Given
        //When
        double result = calculator.div(10, 5);
        double expectedResult = 2;

        //Then
        assertEquals(result, expectedResult);
    }

}
