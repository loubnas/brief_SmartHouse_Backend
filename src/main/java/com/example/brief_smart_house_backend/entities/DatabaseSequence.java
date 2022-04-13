package com.example.brief_smart_house_backend.entities;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
@Data
@ToString
public class DatabaseSequence {

    @Id
    private String id;
    private long seq;

}