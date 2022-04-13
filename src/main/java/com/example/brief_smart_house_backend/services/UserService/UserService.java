package com.example.brief_smart_house_backend.services.UserService;

import com.example.brief_smart_house_backend.entities.User;
import com.example.brief_smart_house_backend.services.SequenceGeneratorService;
import com.example.brief_smart_house_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    SequenceGeneratorService sequenceGenerator;


    @Override
    public User AddUser(User user) {
        user.setId(sequenceGenerator.generateSequence(User.SEQUENCE_NAME));
        User us = userRepository.save(user);
        return us;
    }

    @Override
    public List<User> getAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

}
