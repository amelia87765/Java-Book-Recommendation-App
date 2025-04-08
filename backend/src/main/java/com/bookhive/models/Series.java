package com.bookhive.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Series {

    @Id
    private String id;

    private String name;

    @Relationship(type = "IN_SERIES", direction = Relationship.Direction.INCOMING)
    private List<Book> books = new ArrayList<>();
}
