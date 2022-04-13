package com.example.brief_smart_house_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("Floor")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Floor  implements Serializable {

    @Transient
    public static final String SEQUENCE_NAME = "floor_sequence";


    @Id
    private Long id;

    private int number;

}
