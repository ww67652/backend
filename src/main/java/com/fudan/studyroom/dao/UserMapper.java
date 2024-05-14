package com.fudan.studyroom.dao

-room.generator.dao;

import com.fudan.study-room.generator.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}