package com.example.brief_smart_house_backend;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BriefSmartHouseBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BriefSmartHouseBackendApplication.class, args);
    }

    @Bean
    public org.modelmapper.ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
