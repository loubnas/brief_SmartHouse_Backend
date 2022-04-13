package com.example.brief_smart_house_backend;

import com.example.brief_smart_house_backend.entities.User;
import com.example.brief_smart_house_backend.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class BriefSmartHouseBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BriefSmartHouseBackendApplication.class, args);
    }

    @Bean
    public org.modelmapper.ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
