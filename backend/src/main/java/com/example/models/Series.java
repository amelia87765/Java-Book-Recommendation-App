package com.example.models;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data

public class Series {
    @Id
    private String seriesId;
    private String name;
}
