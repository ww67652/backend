package com.fudan.studyroom.controller;

import com.fudan.studyroom.entity.Room;
import com.fudan.studyroom.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/api/studyrooms")
@Controller
public class RoomController {

    @Resource
    RoomService roomService;
    // 示例：添加房间
    @RequestMapping(value = "",method = RequestMethod.GET)
    public void addRoom(Room room) {
        roomService.addRoom(room);
    }

    // 示例：删除房间
    @RequestMapping(value = "/{roomId}",method = RequestMethod.DELETE)
    public void deleteRoom(@PathVariable("roomId") int roomId) {
        roomService.deleteRoom(roomId);
    }

    // 示例：更新自习室
    @RequestMapping(value = "/{roomId}",method = RequestMethod.PUT)
    public void updateRoom(@PathVariable("roomId") int roomId, Room room) {
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
