package com.example.models;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
public class Book {
    @Id
    private String bookId;
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;
    private double averageRating;
    private int ratingsCount;
    private int authorId;
    private int seriesId;
    private String genre;
}
