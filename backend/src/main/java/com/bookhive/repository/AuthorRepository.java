package com.bookhive.repository;

import com.bookhive.models.Author;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface AuthorRepository extends Neo4jRepository<Author, String> {
    Optional<Author> findByName(String name);
}
