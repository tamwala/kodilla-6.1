package com.example.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(20);
    }

    @Override
    public String getIngredients() {
        return "Tomato sauce, cheese";
    }
}
