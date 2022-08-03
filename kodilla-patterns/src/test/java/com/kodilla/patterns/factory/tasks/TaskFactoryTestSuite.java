package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        System.out.println("Has " + shoppingTask.getTaskName() + " been executed? " + shoppingTask.isTaskExecuted());

        //Then
        assertEquals("Shopping task", shoppingTask.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        System.out.println("Has " + paintingTask.getTaskName() + " been executed? " + paintingTask.isTaskExecuted());

        //Then
        assertEquals("Painting task", paintingTask.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        System.out.println("Has " + drivingTask.getTaskName() + " been executed? " + drivingTask.isTaskExecuted());

        //Then
        assertEquals("Driving task", drivingTask.getTaskName());
    }
}
