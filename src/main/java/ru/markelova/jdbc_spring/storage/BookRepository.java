package ru.markelova.jdbc_spring.storage;

import ru.markelova.jdbc_spring.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book findBookById(Long id);
}