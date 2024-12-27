package com.example.repository;

import com.example.model.Author;
import com.example.model.Book;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BookRepository {
    static List<Book> books;

    static {
        Book book1 = new Book(1, "GraphQL Overview", 100, new Author("Amit", "90783642525"));
        Book book2 = new Book(2, "Spring Overview", 100, new Author("Lokesh", "8652324253"));
        books = Arrays.asList(book1, book2);
    }

    public List<Book> allBooks() {
        return books;
    }

    public Book bookById(Integer id) {
        for (Book book : books) {
            if (book.getId() == id)
                return book;
        }
        return null;
    }

    public Book updateBook(Integer id, String title) {
        Book book = bookById(id);
        if (book != null) {
            book.setTitle(title);
        }
        return book;
    }
}
