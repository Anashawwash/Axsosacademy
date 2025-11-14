package com.anas.booksapi.controllers;


import com.anas.booksapi.models.Book;
import com.anas.booksapi.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }



    @GetMapping("/create")
    public void createBook(@RequestParam(value = "title") String title,
                           @RequestParam(value = "desc") String desc,
                           @RequestParam(value = "lang") String lang,
                           @RequestParam(value = "pages") int numOfPages) {
        bookService.createbook(title , desc, lang , numOfPages);
    }


    @GetMapping("/update/{id}")
public Book updateBook(@RequestParam(value = "title") String title,
                           @RequestParam(value = "desc") String desc,
                           @RequestParam(value = "lang") String lang,
                           @RequestParam(value = "pages") int numOfPages,
                            @PathVariable(value = "id")Long id) {
        return bookService.updateBook( id , title , desc , lang , numOfPages);
    }

    @GetMapping("/delete/{id}")
public String deleteBook(@PathVariable(value = "id") Long id){
        bookService.deleteBook(id);
        return "Good job";
    }


}
