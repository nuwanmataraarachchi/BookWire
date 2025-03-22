package com.project.bookwire.Service;

import com.project.bookwire.Repository.BookRepository;
import com.project.bookwire.Entity.Book; // Make sure this import is added
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    public Book getBookByName(String bookname){
      return  bookRepository.findBookByTitle(bookname);

    }
    public Book updateBook(Integer id, Book book){

       Book existBook = bookRepository.findById(id).orElse(null);

        if(existBook == null){
            return null;
        }
        existBook.setTitle(book.getTitle());
        existBook.setGenre(book.getGenre());
        existBook.setAuthor(book.getAuthor());
        return bookRepository.save(existBook);

    }
    public void deleteBookById(Integer id) {
        bookRepository.deleteById(id);
    }


}
