package com.example.kodilla.patterns2.decorator.taxiportal;

import com.example.kodilla.patterns2.decorator.pizza.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    PizzaOrder pizzaOrder = new BasicPizzaOrder();

    @BeforeEach
    public void setupPizza() {
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
    }

    @Test
    public void testGetPizzaWithAllIngredientsCost() {
        //Given
        System.out.println(pizzaOrder.getCost());

        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(39), pizzaCost);
    }

    @Test
    public void testGetPizzaWithAllIngredientsDescription() {
        //Given
        System.out.println(pizzaOrder.getIngredients());

        //When
        String pizzaDescription = pizzaOrder.getIngredients();

        //Then
        assertEquals("Tomato sauce, cheese, mushroom, bacon, salami", pizzaDescription);
    }
}
