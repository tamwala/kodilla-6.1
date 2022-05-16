package com.kodilla.testing.collection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

import java.util.*;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @DisplayName("Checks if function exterminate works properly with empty list provided as an argument")

    @Test
    public void OddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator number = new OddNumbersExterminator();
        List<Integer> list = new ArrayList<>();

        //When
        List<Integer> evenList = number.exterminate(list);
        boolean isEmpty = evenList.isEmpty();

        //Then
        Assertions.assertTrue(isEmpty);
    }

    @DisplayName("Checks if function returns list with even numbers")

    @Test
    public void OddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator number = new OddNumbersExterminator();

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(4);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);

        //When
        List<Integer> evenList = number.exterminate(list);

        //Then
        Assertions.assertTrue(expectedResult.containsAll(evenList) && evenList.containsAll(expectedResult));
    }
}
