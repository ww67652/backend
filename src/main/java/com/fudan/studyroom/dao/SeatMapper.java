package com.fudan.studyroom.dao

-room.generator.dao;

import com.fudan.study-room.generator.entity.Seat;
import java.util.List;

public interface SeatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seat record);

    Seat selectByPrimaryKey(Integer id);

    List<Seat> selectAll();

    int updateByPrimaryKey(Seat record);
}