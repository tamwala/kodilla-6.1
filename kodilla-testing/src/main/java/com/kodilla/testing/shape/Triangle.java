package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String figure = "triangle";
    int a;
    int h;

    public Triangle() {};

    public Triangle(String figure) {
        this.figure = figure;
    }

    @Override
    public String getShapeName(){
        return figure;
    }


    public int getField() {
        return (a * h) / 2 ;
    }

    @Override
    public String toString() {
        return figure;
    }

}
