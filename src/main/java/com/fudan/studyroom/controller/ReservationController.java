package com.example.studyroom.controller;

import com.example.studyroom.entity.Reservation;
import com.example.studyroom.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public Reservation makeReservation(@RequestParam Long seatId,
                                       @RequestParam String username,
                                       @RequestParam LocalDateTime startTime,
                                       @RequestParam LocalDateTime endTime) {
        return reservationService.makeReservation(seatId, username, startTime, endTime);
    }

    @GetMapping("/{username}")
    public List<Reservation> getReservationsByUser(@PathVariable String username) {
        return reservationService.getReservationsByUser(username);
    }

    @DeleteMapping("/{id}")
    public void cancelReservation(@PathVariable Long id) {
        reservationService.cancelReservation(id);
    }
}
