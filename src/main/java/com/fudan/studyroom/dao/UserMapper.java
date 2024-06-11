package com.fudan.studyroom.dao;
import com.fudan.studyroom.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<User> selectByNameAndPassword(String name, String password);

    User selectByName(String name);
}