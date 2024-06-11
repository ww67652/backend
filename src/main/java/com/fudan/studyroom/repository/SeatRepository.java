package com.example.studyroom.repository;

import com.example.studyroom.entity.Seat;
import com.example.studyroom.entity.StudyRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findAllByStudyRoom(StudyRoom studyRoom);
}
