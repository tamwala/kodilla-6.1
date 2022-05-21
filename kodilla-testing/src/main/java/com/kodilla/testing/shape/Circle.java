package com.kodilla.testing.shape;

public class Circle implements Shape{

    String figure = "circle";
    int r;

    public Circle(){};

    public Circle(String figure) {
        this.figure = figure;
    }

    @Override
    public String getShapeName(){
        return figure;
    }


    public int getField() {
        return (int)(Math.PI * r * r);
    }

    @Override
    public String toString() {
        return figure;
    }
}


