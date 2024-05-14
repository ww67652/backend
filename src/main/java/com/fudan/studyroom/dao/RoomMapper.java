package com.fudan.studyroom.dao

-room.generator.dao;

import com.fudan.study-room.generator.entity.Room;
import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Room record);

    Room selectByPrimaryKey(Integer id);

    List<Room> selectAll();

    int updateByPrimaryKey(Room record);
}