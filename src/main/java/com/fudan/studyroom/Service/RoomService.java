package com.fudan.studyroom.service;

import com.fudan.studyroom.entity.Room;

import java.util.List;

public interface RoomService {

    void addRoom(Room room);

    void deleteRoom(int roomId);
    
    void updateRoom(int roomId, Room room);

    List<Room> getRooms(String building, Integer floor, Integer room, boolean available);
}
