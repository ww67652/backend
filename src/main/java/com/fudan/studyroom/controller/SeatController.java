package com.example.studyroom.controller;

import com.example.studyroom.entity.Seat;
import com.example.studyroom.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @PostMapping("/{studyRoomId}")
    public Seat addSeat(@PathVariable Long studyRoomId, @RequestBody Seat seat) {
        return seatService.addSeat(studyRoomId, seat);
    }

    @GetMapping("/{studyRoomId}")
    public List<Seat> getSeatsByStudyRoom(@PathVariable Long studyRoomId) {
        return seatService.getSeatsByStudyRoom(studyRoomId);
    }

    @PutMapping("/{id}")
    public Seat updateSeat(@PathVariable Long id, @RequestBody Seat seat) {
        return seatService.updateSeat(id, seat);
    }

    @DeleteMapping("/{id}")
    public void deleteSeat(@PathVariable Long id) {
        seatService.deleteSeat(id);
    }
}
