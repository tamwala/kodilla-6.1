package com.kodilla.testing.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

    @Test
    void testlistBooksWithConditionReturnList() {
        //Given
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //when
        List<Book>thelistOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, thelistOfBooks.size());

        assertTrue(false);
    }



    @Test
    void testlistBooksWithConditionMoreThan20(){

        //Given
        List<Book> resultListOfBooks = new ArrayList<Book>();
        List<Book>resultListOf15Books = generateListOfNBooks(15);
        List<Book>resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOfBooks);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        //When
        List<Book>theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book>theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book>theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());

    }


    @Test
    void testListBooksWithConditionFragmentShorterThan3() {

        // Given & When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testlistBooksInHandsOfZeroBooks() {

        //Given
        List<Book> resultListOfBooks = new ArrayList<>();

        when(libraryDatabaseMock.listBooksInHandsOf(new LibraryUser("Jan", "Kowalski", "88010122888"))).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(new LibraryUser("Jan", "Kowalski", "88010122888"));

        //Then
        assertEquals(0, theListOfBooks.size());
    }


    @Test
    void testlistBooksInHandsOfOneBook() {

        //Given
        List<Book> resultListOfBooks = generateListOfNBooks(1);

        when(libraryDatabaseMock.listBooksInHandsOf(new LibraryUser("Jan", "Kowalski", "88010122888"))).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(new LibraryUser("Jan", "Kowalski", "88010122888"));

        //Then
        assertEquals(1, theListOfBooks.size());

    }

    @Test
    void testlistBooksInHandsOfFiveBooks() {

        //Given
        List<Book> resultListOfBooks = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksInHandsOf(new LibraryUser("Jan", "Kowalski", "88010122888"))).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(new LibraryUser("Jan", "Kowalski", "88010122888"));

        //Then
        assertEquals(5, theListOfBooks.size());

    }
}
