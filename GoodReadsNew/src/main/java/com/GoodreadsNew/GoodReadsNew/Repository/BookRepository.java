package com.GoodreadsNew.GoodReadsNew.Repository;

import com.GoodreadsNew.GoodReadsNew.models.Book;

import java.util.ArrayList;

public interface BookRepository {
    ArrayList<Book> getBooks();
}
