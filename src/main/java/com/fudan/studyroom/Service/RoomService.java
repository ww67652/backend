package com.fudan.studyroom.service;

import com.fudan.studyroom.entity.Room;

public interface RoomService {

    void addRoom(Room room);

    void deleteRoom(int roomId);

    void updateRoom(int roomId, Room room);
}
