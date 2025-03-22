package com.project.bookwire.Repository;

import com.project.bookwire.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    public Book findBookByTitle(String title);

}
