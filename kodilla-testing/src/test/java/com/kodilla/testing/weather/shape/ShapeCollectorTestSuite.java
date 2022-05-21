package com.kodilla.testing.weather.shape;
import com.kodilla.testing.shape.*;

import org.junit.jupiter.api.*;

import java.util.Random;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle());

        //Then
        Assertions.assertEquals(1, shapeCollector.getListOfShapes().size());
    }


    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle());

        //When
        boolean result = shapeCollector.removeFigure(new Circle());

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle());
        shapeCollector.addFigure(new Triangle());
        shapeCollector.addFigure(new Square());

        //When
        Random random = new Random();
        int randomIndex = random.nextInt(shapeCollector.getListOfShapes().size());
        Shape expectedResult = shapeCollector.getListOfShapes().get(randomIndex);
        Shape result = shapeCollector.getFigure(randomIndex);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle("circle1"));
        shapeCollector.addFigure(new Triangle("triangle1"));
        shapeCollector.addFigure(new Square("square1"));

        //When
        String result = shapeCollector.showFigures();
        String expectedResult = "[circle1, triangle1, square1]";

        //Then
        Assertions.assertEquals(expectedResult, result);
    }



}
