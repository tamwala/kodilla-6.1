package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private  LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book>listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList; //koniec dalszego wykonywania metody, jeśli tytuł ma mniej niż 3 znaki to nie robię wyszukiwania tylko zwracam pustą listę
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment); //wtedy sięga do bazy danych- to mój mock , wartości zwrócone takie jak ustalone przy użyciu statycznej metody while
        if (resultList.size() > 20) return bookList; //też zwróci pustą listę, bo ona zawsze jest pusta
        bookList = resultList;
        return bookList;
    }

    public List<Book>listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> bookList = new ArrayList<>();
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (resultList.size() == 0) {
            return bookList;
        } else bookList = resultList;
        return bookList;

        //return libraryDatabase.listBooksHandsOf(libraryUser); // to trzeba było napisać przed implemetacją metody by test się wykonał
    }
}
