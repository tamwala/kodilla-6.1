package com.example.kodilla.patterns2.adapter.bookclassifier;

import com.example.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.example.kodilla.patterns2.adapter.bookclasifier.librarya.BookLibraryA;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        BookLibraryA book1 = new BookLibraryA("Delia Owens", "Gdzie śpiewają raki",
                2017,"123456" );
        BookLibraryA book2 = new BookLibraryA("Stephen King", "Baśniowa Opowieść",
                2010, "654321");
        BookLibraryA book3 = new BookLibraryA("Taylor Jenkins Reid", "Malibu płonie",
                2020, "123654");
        BookLibraryA book4 = new BookLibraryA("Toshikazu Kawaguchi", "Zanim wystygnie kawa",
                2007, "321456");
        MedianAdapter libraryAdapter = new MedianAdapter();
        Set<BookLibraryA> booksFromLibA = new HashSet<>();
        booksFromLibA.add(book1);
        booksFromLibA.add(book2);
        booksFromLibA.add(book3);
        booksFromLibA.add(book4);

        //When
        int publicationYearMedian = libraryAdapter.publicationYearMedian(booksFromLibA);

        //Then
        assertEquals(2017, publicationYearMedian);
    }
}
