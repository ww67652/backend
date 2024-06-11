package com.fudan.studyroom.service;

import com.fudan.studyroom.entity.Seat;

import java.util.Date;

public interface SeatService {
    void addSeat(Integer roomId, Seat seat);

    void deleteSeat(Integer seatId);

    void updateSeat(Integer seatId, Seat seat);

    Seat getSeat(Integer seatId);

    void ReserveSeat(Integer roomId, Integer seatId, Integer userId, Date startTime, Date endTime);
}
