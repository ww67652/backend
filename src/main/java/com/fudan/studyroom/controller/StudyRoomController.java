package com.example.studyroom.controller;

import com.example.studyroom.entity.StudyRoom;
import com.example.studyroom.service.StudyRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studyrooms")
public class StudyRoomController {

    @Autowired
    private StudyRoomService studyRoomService;

    @PostMapping
    public StudyRoom addStudyRoom(@RequestBody StudyRoom studyRoom) {
        return studyRoomService.addStudyRoom(studyRoom);
    }

    @GetMapping
    public List<StudyRoom> getAllStudyRooms() {
        return studyRoomService.getAllStudyRooms();
    }

    @PutMapping("/{id}")
    public StudyRoom updateStudyRoom(@PathVariable Long id, @RequestBody StudyRoom studyRoom) {
        return studyRoomService.updateStudyRoom(id, studyRoom);
    }

    @DeleteMapping("/{id}")
    public void deleteStudyRoom(@PathVariable Long id) {
        studyRoomService.deleteStudyRoom(id);
    }
}
