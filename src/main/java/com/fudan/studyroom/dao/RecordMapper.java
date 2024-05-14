package com.fudan.studyroom.dao

-room.generator.dao;

import com.fudan.study-room.generator.entity.Record;
import java.util.List;

public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    Record selectByPrimaryKey(Integer id);

    List<Record> selectAll();

    int updateByPrimaryKey(Record record);
}