package com.bookhive.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private String id;

    private String title;
    private int year;

    @Relationship(type = "WROTE", direction = Relationship.Direction.INCOMING)
    private Author author;

    @Relationship(type = "IN_SERIES", direction = Relationship.Direction.OUTGOING)
    private Series series;

}
