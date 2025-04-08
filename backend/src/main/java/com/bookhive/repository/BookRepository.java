package com.bookhive.repository;

import com.bookhive.models.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.List;

public interface BookRepository extends Neo4jRepository<Book, String> {
    List<Book> findByAuthor(String author);
}
