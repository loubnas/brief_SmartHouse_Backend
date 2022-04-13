package com.example.brief_smart_house_backend.services.UserService;

import com.example.brief_smart_house_backend.entities.User;

import java.util.List;

public interface IUserService {
    User AddUser(User user);
    List<User> getAll();

}
