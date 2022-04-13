package com.example.brief_smart_house_backend.repository;


import com.example.brief_smart_house_backend.entities.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

public interface HouseRepository extends MongoRepository<House, Long> {
        House findById(long id);
        Void deleteById(long id);
}