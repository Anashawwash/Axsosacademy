package com.anas.bookclub.services;

import com.anas.bookclub.Models.Book;
import com.anas.bookclub.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    @Autowired
    private BookRepository bookRepo;


    public void saveBook( Book book){
        bookRepo.save(book);
    }


    public List<Book> getAllBook(){
       return bookRepo.findAll();
    }

    public Book getBookById(Long id ){
        return  bookRepo.findById(id).get();
    }

    public void deleteBook(Book book){
        bookRepo.delete(book);
    }
}
