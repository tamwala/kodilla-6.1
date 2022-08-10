//package com.kodilla.testing.forum;
//
//import com.kodilla.testing.user.SimpleUser;
//import org.junit.jupiter.api.*;
//
//import java.util.logging.SimpleFormatter;
//
//@DisplayName("TDD: Forum Test Suite")
//public class ForumTestSuite {
//
//    @BeforeEach
//    public void before() {
//        System.out.println("Test Case: begin");
//    }
//
//    @AfterEach
//    public void after() {
//        System.out.println("Test Case: end");
//    }
//
//    @BeforeAll
//    public static void beforeAll() {
//        System.out.println("Test suite: begin");
//    }
//
//    @AfterAll
//    public static void afterAll() {
//        System.out.println("Test suite: end");
//    }
//
//    @DisplayName(
//            "When created SimpleUser with name, " +
//                    "then getUsername should return correct name"
//    )
//
//    @Test
//    void testCaseRealName() {
//        //Given
//
//        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
//
//        //When
//        String result = simpleUser.getRealName();
//        System.out.println("Testing " + result);
//
//        //String expectedResult = "theForumUser";
//
//        //Then
//        Assertions.assertEquals("John Smith", result);
//    }
//
//    @Test
//    void testCaseUserName() {
//        //Given
//
//        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
//        String expectedResult = "theForumUser";
//
//        //When
//        String result = "theForumUser";
//
//        //Then
//        Assertions.assertEquals(expectedResult, result);
//    }
//
//
//}
