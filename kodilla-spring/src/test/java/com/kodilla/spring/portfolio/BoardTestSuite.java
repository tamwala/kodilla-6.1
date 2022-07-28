package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.addTask(board.getToDoList(), "Task to do");
        board.addTask(board.getInProgressList(), "Task in progress");
        board.addTask(board.getDoneList(), "Task done");

        //Then
        assertEquals(board.getToDoList().getTasks().get(0), "Task to do");
        assertEquals(board.getInProgressList().getTasks().get(0), "Task in progress");
        assertEquals(board.getDoneList().getTasks().get(0), "Task done");
    }
}
