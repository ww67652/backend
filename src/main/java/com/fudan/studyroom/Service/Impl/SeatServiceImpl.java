package com.fudan.studyroom.service.Impl;

import com.fudan.studyroom.dao.RoomMapper;
import com.fudan.studyroom.dao.SeatMapper;
import com.fudan.studyroom.entity.Room;
import com.fudan.studyroom.entity.Seat;
import com.fudan.studyroom.service.SeatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SeatServiceImpl implements SeatService {

    @Resource
    SeatMapper seatMapper;
    @Resource
    RoomMapper roomMapper;

    @Override
    public void addSeat(Integer roomId, Seat seat) {
        seatMapper.insert(seat);
        Room room = roomMapper.selectByPrimaryKey(roomId);
        room.setSeatNum(room.getSeatNum() + 1);
        roomMapper.updateByPrimaryKey(roomId, room);
    }

    @Override
    public void deleteSeat(Integer seatId) {
        Seat seat = seatMapper.selectByPrimaryKey(seatId);
        Integer roomId = seat.getRid();
        seatMapper.deleteByPrimaryKey(seatId);
        Room room = roomMapper.selectByPrimaryKey(roomId);
        room.setSeatNum(room.getSeatNum() - 1);
        roomMapper.updateByPrimaryKey(roomId, room);
    }
    @Override
    public void updateSeat(Integer seatId, Seat seat) {
        seatMapper.updateByPrimaryKey(seatId, seat);
    }

    @Override
    public Seat getSeat(Integer seatId) {
        return seatMapper.selectByPrimaryKey(seatId);
    }
}
