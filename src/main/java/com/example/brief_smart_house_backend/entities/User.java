package com.example.brief_smart_house_backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document("User")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {


    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private Long id;

    private String username;

    private String password;


}
