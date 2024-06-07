package com.fudan.studyroom.service.Impl;

import com.fudan.studyroom.dao.UserMapper;
import com.fudan.studyroom.entity.User;
import com.fudan.studyroom.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> selectByNameAndPassword(String name, String password) {
        return (List<User>) userMapper.selectByNameAndPassword(name, password);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }

}

