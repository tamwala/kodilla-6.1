package com.example.kodilla.patterns2.decorator.taxiportal;

import com.example.kodilla.patterns2.decorator.pizza.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testGetPizzaWithAllIngredientsCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());

        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(39), pizzaCost);
    }

    @Test
    public void testGetPizzaWithAllIngredientsDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getIngredients());

        //When
        String pizzaDescription = pizzaOrder.getIngredients();

        //Then
        assertEquals("Tomato sauce, cheese, mushroom, bacon, salami", pizzaDescription);

    }
}
