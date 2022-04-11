package com.example.brief_smart_house_backend.dto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DeviceDto {
    private Long id;
    private boolean status;

}
