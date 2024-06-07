package com.fudan.studyroom.service;

import com.fudan.studyroom.entity.Seat;

public interface SeatService {
    void addSeat(Integer roomId, Seat seat);

    void deleteSeat(Integer seatId);

    void updateSeat(Integer seatId, Seat seat);

    Seat getSeat(Integer seatId);
}
