package com.klef.jfsd.exam.labexam.Service;

import com.klef.jfsd.exam.labexam.Model.Book;

import java.util.List;

public interface BookServiceInterface {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    void updateBook(Long id, Book bookDetails);
}