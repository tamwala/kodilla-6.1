package com.kodilla.testing.weather.stub;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double counter = 0;
        double mapSum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            mapSum += temperature.getValue();
            counter++;
        }
        return mapSum/counter;
    }

    public Double calculateMedian() {
        List <Double> tempList = new ArrayList<>();
        int tempMedium = 0;
        double medium = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
             tempList.add(temperature.getValue());
             Collections.sort(tempList);
             int listSize = tempList.size();
             if (listSize % 2 != 0) {
                 tempMedium = (listSize/2);
                 medium = tempList.get(tempMedium);
             } else {
                 tempMedium = (listSize/2 - 1);
                 medium = (tempList.get(listSize/2) + tempList.get(tempMedium))/2;
             }
        }
        return medium;
    }

}




