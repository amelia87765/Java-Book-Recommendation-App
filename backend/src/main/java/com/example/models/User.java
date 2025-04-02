package com.example.models;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data

public class User {
    @Id
    private String userId;
    private String name;
    private String surname;
    private String email;
    private String password;
}