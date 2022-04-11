package com.example.brief_smart_house_backend.dto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HouseDto {
    private Long id;
    private String name;
    private String adress;
}
