package com.bookhive.models;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data

public class Author {
    @Id
    private String authorId;
    private String name;
    private String surname;
    private int birthYear;
    private String nationality;
}
