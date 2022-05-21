package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.*;

public class ShapeCollector {


    List<Shape> listOfShapes = new ArrayList<>();

    public List<Shape> getListOfShapes() {
        return listOfShapes;
    }

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return listOfShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return listOfShapes.get(n);
    }

    public String showFigures() {
        return listOfShapes.toString();
    }


}
