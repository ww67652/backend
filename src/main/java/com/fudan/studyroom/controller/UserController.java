package com.fudan.studyroom.controller;

import com.fudan.studyroom.entity.User;
import com.fudan.studyroom.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
@RequestMapping("/api/users")
@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public Integer registerUser(
            @RequestParam("userName") String userName,
            @RequestParam("passWord") String passWord
            ) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(passWord);

        return userService.insert(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public boolean loginUser(
            @RequestParam("userName") String userName,
            @RequestParam("passWord") String passWord
            ) {
        return !userService.selectByNameAndPassword(userName, passWord).isEmpty();
    }


    @RequestMapping(value = "/{username})", method = RequestMethod.GET)
    public User getUser(
            @PathVariable("username") String username
            ) {
        return userService.selectByName(username);
    }
}
