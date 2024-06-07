package com.fudan.studyroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/api/reservations")
@Controller
public class ReservationController {
    // 添加预约的逻辑
    @RequestMapping(value = "/reserve", method = RequestMethod.POST)
    public String reserveRoom() {

        return "success";
    }
}
