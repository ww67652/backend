package com.fudan.studyroom.service.Impl;

import com.fudan.studyroom.dao.RoomMapper;
import com.fudan.studyroom.entity.Room;
import com.fudan.studyroom.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Resource
    RoomMapper roomMapper;

    @Override
    public void addRoom(Room room) {
        // 实现添加自习室的功能
        roomMapper.insert(room);
    }

    @Override
    public void deleteRoom(int roomId) {
        // 实现删除自习室的功能
        roomMapper.deleteByPrimaryKey(roomId);
    }

    @Override
    public void updateRoom(int roomId, Room room) {
        // 实现更新自习室信息的功能
        roomMapper.updateByPrimaryKey(roomId, room);
    }

}
