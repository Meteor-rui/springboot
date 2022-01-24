package com.mcy.springbootswagger.service.impl;

import com.mcy.springbootswagger.mapper.UserMapper;
import com.mcy.springbootswagger.User.User;
import com.mcy.springbootswagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    //用户验证
//    @Override
//    public boolean login(String username, String password) {
//        User user = userMapper.findUserByUserName(username);
//        if (user!=null && user.getPassword().equals(password)){
//            return true;
//        }
//        return false;
//    }
    @Override
    public List<User> findAll() {
        List<User> userList = userMapper.findAll();
        return userList;
    }

    @Override
    public User selectUserById(Integer id) {

        return userMapper.selectUserById(id);
    }
    @Override
    public void addUser(User user) {
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        user.setAge(age);
        userMapper.addUser(user);
    }

    @Override
    public int deleteUser(Integer id){
        userMapper.deleteUser(id);
        return 0;
    }

    @Override
    public void updateUser(User user){

        userMapper.updateUser(user);
    }
}