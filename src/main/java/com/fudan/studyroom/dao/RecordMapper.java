package com.fudan.studyroom.dao;
import com.fudan.studyroom.entity.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    Record selectByPrimaryKey(Integer id);

    List<Record> selectAll();

    int updateByPrimaryKey(Record record);
}