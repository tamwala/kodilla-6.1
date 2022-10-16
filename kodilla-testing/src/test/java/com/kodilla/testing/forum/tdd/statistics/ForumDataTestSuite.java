package com.kodilla.testing.forum.tdd.statistics;

import com.kodilla.testing.forum.statistics.ForumData;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumDataTestSuite {
    static int testCounter;
    Statistics statisticsMock = mock(Statistics.class);
    ForumData forumData;
    List<String> users;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        forumData = new ForumData(statisticsMock);
        users = new ArrayList<>();
        users.add("Bolek");
        users.add("Lolek");
    }

    @Test
    public void calculateAdvStatisticsPosts0() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        forumData.calculateAdvStatistics();

        //Then
        assertTrue(forumData.getAvgCommentsOnPosts() == Double.POSITIVE_INFINITY);
    }

    @Test
    public void calculateAdvStatisticsPosts1000() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        forumData.calculateAdvStatistics();

        //Then
        assertTrue(forumData.getAvgCommentsOnPosts() == 2);
    }

    @Test
    public void calculateAdvStatisticsComments0() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumData.calculateAdvStatistics();

        //Then
        assertTrue(forumData.getAvgCommentsOnPosts() == forumData.getAvgCommentsOnUser());
    }

    @Test
    public void calculateAdvStatisticsCommentsLessThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumData.calculateAdvStatistics();

        //Then
        assertTrue(statisticsMock.postsCount() > statisticsMock.commentsCount());
    }

    @Test
    public void calculateAdvStatisticsPostsLessThanComments() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumData.calculateAdvStatistics();

        //Then
        assertTrue(statisticsMock.postsCount() < statisticsMock.commentsCount());
    }

    @Test
    public void calculateAdvStatisticsUsers0() {
        //Given
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        forumData.calculateAdvStatistics();

        //Then
        assertTrue((Double) forumData.getAvgCommentsOnUser() == Double.POSITIVE_INFINITY);
    }

    @Test
    public void calculateAdvStatisticsUsers100() {
        //Given
        List<String> users = generatedUsersList(100);

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        forumData.calculateAdvStatistics();

        //Then
        assertTrue(forumData.getAvgPostsOnUser() == 1);
    }

    private List<String> generatedUsersList(int usersQuantity) {
        List<String> genUsers = new ArrayList<String>();
        for (int n = 1; n <= usersQuantity; n++) {
            genUsers.add("User" + n);
        }
        return genUsers;
    }
}
