package com.fudan.studyroom.controller;

import com.fudan.studyroom.entity.Room;
import com.fudan.studyroom.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RequestMapping("/api/studyrooms")
@Controller
public class RoomController {

    @Resource
    RoomService roomService;
    // 示例：添加房间
    @RequestMapping(value = "",method = RequestMethod.POST)
    public void addRoom(String address, Date startTime, Date endTime, boolean available,
                        @RequestParam(defaultValue = "0") boolean type,
                        @RequestParam(defaultValue = "0") int SeatNum) {
        Room room = new Room();
        room.setAddress(address);
        room.setOpenStartTime(startTime);
        room.setOpenEndTime(endTime);
        room.setAvailable(available);
        room.setType(type);
        room.setSeatNum(SeatNum);
        roomService.addRoom(room);
    }

    // 示例：删除房间
    @RequestMapping(value = "/{roomId}",method = RequestMethod.DELETE)
    public void deleteRoom(@PathVariable("roomId") int roomId) {
        roomService.deleteRoom(roomId);
    }

    // 示例：更新自习室
    @RequestMapping(value = "/{roomId}",method = RequestMethod.PUT)
    public void updateRoom(@PathVariable("roomId") int roomId, String address, Date startTime, Date endTime, boolean available,
                           @RequestParam(defaultValue = "0") boolean type,
                           @RequestParam(defaultValue = "0") int SeatNum) {
        Room room = new Room();
        room.setAddress(address);
        room.setOpenStartTime(startTime);
        room.setOpenEndTime(endTime);
        room.setAvailable(available);
        room.setType(type);
        room.setSeatNum(SeatNum);
        roomService.updateRoom(roomId, room);
    }

    // 示例：获取自习室列表
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Room> getRooms(
            @RequestParam(defaultValue = "") String building,
            @RequestParam(defaultValue = "") Integer floor,
            @RequestParam(defaultValue = "") Integer room,
            @RequestParam(defaultValue = "0") boolean available
    ) {
        return roomService.getRooms(building, floor, room, available);
    }

}
