package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "shoppingTask";
    public static final String PAINTING = "paintingTask";
    public static final String DRIVING = "drivingTask";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping task", "dress", 2);
            case PAINTING:
                return new PaintingTask("Painting task", "blue", "house");
            case DRIVING:
                return new DrivingTask("Driving task", "Poland", "car");
            default:
                return null;
        }
    }
}

