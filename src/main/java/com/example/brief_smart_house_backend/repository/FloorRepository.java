package com.example.brief_smart_house_backend.repository;

import com.example.brief_smart_house_backend.entities.Floor;
import com.example.brief_smart_house_backend.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


public interface FloorRepository extends MongoRepository<Floor, Long> {
    User findById(long id);
    Void deleteById(long id);
}
