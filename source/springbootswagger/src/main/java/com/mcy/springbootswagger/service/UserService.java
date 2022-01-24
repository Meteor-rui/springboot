package com.mcy.springbootswagger.service;

import com.mcy.springbootswagger.User.User;
import java.util.List;

public interface UserService {
    User selectUserById(Integer id);
    List<User> findAll();
    int deleteUser(Integer id);
    void addUser(User user);
    void updateUser(User user);
}
