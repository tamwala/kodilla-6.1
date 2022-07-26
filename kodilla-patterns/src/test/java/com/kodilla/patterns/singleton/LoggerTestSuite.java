package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("Item has been processed");

        //When
        String result = logger.getLastLog();
        String expectedResult = "Item has been processed";

        //Then
        assertEquals(result, expectedResult);


    }
}
