package com.GoodreadsNew.GoodReadsNew.controllers;

import com.GoodreadsNew.GoodReadsNew.Repository.BookRepository;
import com.GoodreadsNew.GoodReadsNew.models.Book;
import com.GoodreadsNew.GoodReadsNew.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

public class BookController {

    BookService bookService = new BookService();

    @GetMapping("/")
    public String tester(){
        return "Test";
    }

    @GetMapping("/books")
    public ArrayList<Book> getBooks(){
        return bookService.getBooks();
    }

}
