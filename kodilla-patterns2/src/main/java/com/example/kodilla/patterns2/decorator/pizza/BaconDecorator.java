package com.example.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BaconDecorator extends AbstractPizzaOrderDecorator {

    public BaconDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", bacon";
    }
}