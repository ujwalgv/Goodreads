package com.GoodreadsNew.GoodReadsNew.services;

import com.GoodreadsNew.GoodReadsNew.Repository.BookRepository;
import com.GoodreadsNew.GoodReadsNew.models.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class BookService implements BookRepository {
    private HashMap<Integer, Book> hmap = new HashMap<>();

    public BookService() {
        Book b1 = new Book(1, "Harry Potter", "harry_potter.jpg");
        Book b2 = new Book(2, "How Life Works", "hlw.jpg");
        hmap.put(b1.getId(),b1);
        hmap.put(b2.getId(),b2);

    }

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> allBooks = hmap.values();
        ArrayList<Book> allBooksList = new ArrayList<>(allBooks);
        return allBooksList;
    }
}
