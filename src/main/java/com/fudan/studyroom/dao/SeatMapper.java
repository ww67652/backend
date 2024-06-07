package com.fudan.studyroom.dao;
import com.fudan.studyroom.entity.Seat;
import java.util.List;

public interface SeatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seat record);

    Seat selectByPrimaryKey(Integer id);

    List<Seat> selectAll();

    int updateByPrimaryKey(Integer id, Seat record);
}