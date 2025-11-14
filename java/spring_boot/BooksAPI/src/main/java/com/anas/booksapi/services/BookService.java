package com.anas.booksapi.services;

import com.anas.booksapi.models.Book;
import com.anas.booksapi.repositories.BookRepository;
import com.sun.jdi.BooleanValue;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class BookService{
    private  final BookRepository bookRepository;


    public BookService(BookRepository bookRepository){
        this.bookRepository =  bookRepository;
    }


    public Book createbook(String title , String desc , String lang , int pages){
        Book book = new Book(title,desc,lang,pages);
        return bookRepository.save(book);
    }

    public Book getBookById(Long id){
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()){
            return optionalBook.get();
        }
        else{
            return null;
        }
    }

    public Book  updateBook( Long id ,String title , String desc , String lang , int pages){
        Book book = getBookById(id);
        if(book != null){
          book.setTitle(title);
          book.setDescription(desc);
          book.setLanguage(lang);
          book.setNumberOfPages(pages);
          return bookRepository.save(book);
        }
        return null;
    }


    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public ArrayList<Book> showAllBook(){
        return (ArrayList<Book>) bookRepository.findAll();
    }


}
