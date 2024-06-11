package com.example.studyroom.repository;

import com.example.studyroom.entity.Reservation;
import com.example.studyroom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findAllByUser(User user);
}
