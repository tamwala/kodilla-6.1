package com.example.kodilla.patterns2.adapter.bookclasifier;

import com.example.kodilla.patterns2.adapter.bookclasifier.librarya.BookLibraryA;
import com.example.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.example.kodilla.patterns2.adapter.bookclasifier.libraryb.BookLibraryB;
import com.example.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<BookLibraryA> bookSet) {
        Map<BookSignature, BookLibraryB> booksMap = new HashMap<>();
        for(BookLibraryA book : bookSet) {
            booksMap.put(new BookSignature(book.getSignature()),
                    new BookLibraryB(
                            book.getAuthor(),
                            book.getTitle(),
                            book.getPublicationYear()
                    ));
        }
        return medianPublicationYear(booksMap);
    }
}
