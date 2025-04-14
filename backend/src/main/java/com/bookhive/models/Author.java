package com.bookhive.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.PostLoad;
import org.springframework.data.annotation.Transient;

@Node
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    private String id;

    private String name;
    private String surname;
    private String dateOfBirth;
    private String nationality;

    @Relationship(type = "WROTE")
    private List<Book> books = new ArrayList<>();

    @Transient
    public String getFullName() {
        return name + " " + surname;
    }
}
