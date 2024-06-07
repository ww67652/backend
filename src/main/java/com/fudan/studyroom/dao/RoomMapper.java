package com.fudan.studyroom.dao;
import com.fudan.studyroom.entity.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {
    void deleteByPrimaryKey(Integer id);

    int insert(Room record);

    Room selectByPrimaryKey(Integer id);

    List<Room> selectAll();

    void updateByPrimaryKey(int roomId, Room record);
}