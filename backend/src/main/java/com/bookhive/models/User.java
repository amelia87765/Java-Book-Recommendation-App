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
public class User {

    @Id
    private String id;

    private String name;
    private String surname;
    private String email;
    private String password;

    @Relationship(type = "READ")
    private List<ReadRelation> readBooks = new ArrayList<>();

    @Relationship(type = "IS_FRIENDS_WITH")
    private List<User> friends = new ArrayList<>();

}
