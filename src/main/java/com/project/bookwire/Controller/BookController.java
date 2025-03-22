package com.project.bookwire.Controller;

import com.project.bookwire.Service.BookService;
import com.project.bookwire.Entity.Book; // Make sure this import is added
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);

        // Return the saved book with a 201 status code (created)
        return ResponseEntity.status(201).body(savedBook);
    }

    @GetMapping("/getBook/{bookname}")

    public Book getBookByName(@PathVariable("bookname") String bookname) {

        final Book bookByName = bookService.getBookByName(bookname);
        return bookByName;

    }

    @PutMapping("/updateBook/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book) {
        if (book == null) {
            return ResponseEntity.status(400).build();
        }
        Book updatedBook = bookService.updateBook(id, book);

        if (updatedBook == null) {
            return ResponseEntity.status(404).build(); // Book not found
        }

        return ResponseEntity.status(200).body(updatedBook);
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable Integer id) {
        bookService.deleteBookById(id);
        return ResponseEntity.status(204).build(); // No Content (successful deletion)
    }



}
