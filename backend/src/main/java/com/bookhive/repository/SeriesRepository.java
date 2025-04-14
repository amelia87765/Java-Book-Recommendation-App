package com.bookhive.repository;

import com.bookhive.models.Series;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface SeriesRepository extends Neo4jRepository<Series, String> {
    List<Series> findByNameContainingIgnoreCase(String name);
}
