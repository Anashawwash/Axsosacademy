package com.anas.booksapi.controllers;


import com.anas.booksapi.models.Book;
import com.anas.booksapi.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookControllerTwo {
    private final BookService bookService;


    public BookControllerTwo(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/book/{id}")
    public String showBook(@PathVariable(value = "id")Long id , Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book",book);
        return "showbook.jsp";
    }


    @GetMapping("/books")
    public String showAllBook(Model model){
        System.out.println("hello i am here");
        System.out.println("hello i am here");
        System.out.println("hello i am here");
        System.out.println("hello i am here");
        System.out.println("hello i am here");
        System.out.println("hello i am here");
        System.out.println("hello i am here");

        System.out.println(bookService.showAllBook());
      model.addAttribute("books",bookService.showAllBook());
        return "show.jsp";
    }


}
