package com.fudan.studyroom.dao;
import com.fudan.studyroom.entity.Seat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SeatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seat record);

    Seat selectByPrimaryKey(Integer id);

    List<Seat> selectAll();

    int updateByPrimaryKey(Integer id, Seat seat);
}