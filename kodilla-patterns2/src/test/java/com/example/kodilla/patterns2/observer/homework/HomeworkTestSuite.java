package com.example.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testHomework() {
        //Given
        Student student1 = new Student("Jan");
        Student student2 = new Student("Artur");
        Mentor mentor1 = new Mentor("Adam");
        Mentor mentor2 = new Mentor("Sebastian");
        Mentor mentor3 = new Mentor("Bogdan");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student1.registerObserver(mentor3);
        student2.registerObserver(mentor3);

        //When
        student1.addTask("Task 1");
        student1.addTask("Task 2");
        student2.addTask("Task 1");
        student1.addTask("Task 3");
        student2.addTask("Task 2");

        //Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
        assertEquals(5, mentor3.getUpdateCount());
    }

    @Test
    public void testUnregistering(){
        //Given
        Student student1 = new Student("Jan");
        Student student2 = new Student("Artur");
        Mentor mentor1 = new Mentor("Adam");
        Mentor mentor2 = new Mentor("Sebastian");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        student2.removeObserver(mentor2);

        //When
        student1.addTask("Task 1");
        student2.addTask("Task 1");

        //Then
        assertEquals(1, mentor1.getUpdateCount());
        assertEquals(0, mentor2.getUpdateCount());
    }
}
