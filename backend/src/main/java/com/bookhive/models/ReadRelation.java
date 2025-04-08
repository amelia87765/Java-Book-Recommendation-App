package com.bookhive.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.neo4j.core.schema.TargetNode;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;

@RelationshipProperties
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadRelation {

    @Id
    @GeneratedValue
    private Long id;

    @TargetNode
    private Book book;

    private int rating;
}
