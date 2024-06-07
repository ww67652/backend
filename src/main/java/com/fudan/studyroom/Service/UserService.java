package com.fudan.studyroom.service;

import com.fudan.studyroom.entity.User;

import java.util.List;

public interface UserService {

    int insert(User user);
    
    int update(User user);

    List<User> selectByNameAndPassword(String userName, String passWord);

    User selectByName(String username);
}