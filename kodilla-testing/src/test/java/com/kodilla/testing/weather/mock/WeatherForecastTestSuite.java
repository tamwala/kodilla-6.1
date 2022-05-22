package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;


import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        //Temperatures temperaturesMock = mock(Temperatures.class); linijka 17 zastępuje to


        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.2);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }

    @Test
    void testcalculateAverageWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.2);
        temperaturesMap.put("Kraków", 26.2);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double avgResult = weatherForecast.calculateAverage();
        double avgExpectedResult = 25.7;

        //Then
        Assertions.assertEquals(avgExpectedResult, avgResult);
    }

    @Test
    void testcalculateMedianWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.2);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianResult = weatherForecast.calculateMedian();
        double medianExpectedResult = 25.2;

        //Then
        Assertions.assertEquals(medianExpectedResult, medianResult);
    }


}