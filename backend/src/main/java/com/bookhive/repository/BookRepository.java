package com.bookhive.repository;

import com.bookhive.models.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends Neo4jRepository<Book, String> {
    List<Book> findByGenre(String genre);

    List<Book> findByTitleContainingIgnoreCase(String title);

    @Query("MATCH (b:Book)-[:WROTE]->(a:Author) " +
            "WHERE a.name + ' ' + a.surname = $fullName " +
            "RETURN b")
    List<Book> findByAuthorFullName(@Param("fullName") String fullName);
}
