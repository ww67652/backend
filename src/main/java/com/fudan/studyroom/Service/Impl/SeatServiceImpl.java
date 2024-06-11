package com.fudan.studyroom.service.Impl;

import com.fudan.studyroom.dao.RecordMapper;
import com.fudan.studyroom.dao.RoomMapper;
import com.fudan.studyroom.dao.SeatMapper;
import com.fudan.studyroom.entity.Record;
import com.fudan.studyroom.entity.Room;
import com.fudan.studyroom.entity.Seat;
import com.fudan.studyroom.service.SeatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class SeatServiceImpl implements SeatService {

    @Resource
    SeatMapper seatMapper;
    @Resource
    RoomMapper roomMapper;

    @Resource
    RecordMapper recordMapper;

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


    @Override
    public void ReserveSeat(Integer roomId, Integer seatId, Integer userId, Date startTime, Date endTime){
        Record record = new Record();
        record.setRid(roomId);
        record.setSid(seatId);
        record.setUid(userId);
        record.setStartTime(startTime);
        record.setEndTime(endTime);
        recordMapper.insert(record);
        Seat seat = seatMapper.selectByPrimaryKey(seatId);
        seat.setOccupied(true);
        seatMapper.updateByPrimaryKey(seatId, seat);
        Room room = roomMapper.selectByPrimaryKey(roomId);
        room.setSeatNum(room.getSeatNum() - 1);
        roomMapper.updateByPrimaryKey(roomId, room);
    }

}
