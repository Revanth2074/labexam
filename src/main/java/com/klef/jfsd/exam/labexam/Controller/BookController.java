package com.klef.jfsd.exam.labexam.Controller;

import com.klef.jfsd.exam.labexam.Model.Book;
import com.klef.jfsd.exam.labexam.Service.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookServiceInterface bookService;

    @GetMapping
    public String viewBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "viewbooks";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "updatebook";
    }

    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable("id") Long id, @ModelAttribute("book") Book bookDetails) {
        bookService.updateBook(id, bookDetails);
        return "redirect:/books";
    }
}