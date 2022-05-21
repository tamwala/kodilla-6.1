package com.kodilla.testing.shape;

import java.lang.annotation.Inherited;

public class Square implements Shape{

    String figure = "square";
    int a;
    int b;

    public Square(){};
    public Square(String figure) {
        this.figure = figure;
    }

    @Override
    public String getShapeName(){
        return figure;
    }


    public int getField() {
        return a * b ;
    }

    @Override
    public String toString() {
        return figure;
    }
}


