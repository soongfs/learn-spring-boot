package com.soongfs.learnspringboot.controller;

import com.soongfs.learnspringboot.pojo.User;
import com.soongfs.learnspringboot.pojo.dto.ResponseMessage;
import com.soongfs.learnspringboot.pojo.dto.UserDto;
import com.soongfs.learnspringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController    // 接口方法返回对象 转换成json文本
@RequestMapping("/user")    // localhost:8080/user/**
public class UserController {

    @Autowired
    IUserService userService;

    // REST
    // 增加
    @PostMapping    // URL: localhost:8080/user    method: post
    public ResponseMessage add(@Validated @RequestBody UserDto user) {
        User userNew = userService.add(user);
        return ResponseMessage.success(userNew);
    }

    // 查询
    @GetMapping("/{userId}")
    public ResponseMessage get(@PathVariable Integer userId) {
        User userNew = userService.getUser(userId);
        return ResponseMessage.success(userNew);
    }

    // 修改
    @PutMapping
    public ResponseMessage edit(@Validated @RequestBody UserDto user) {
        User userNew = userService.edit(user);
        return ResponseMessage.success(userNew);
    }


    // 删除
    @DeleteMapping("/{userId}")
    public ResponseMessage delete(@PathVariable Integer userId) {
        userService.delete(userId);
        return ResponseMessage.success();
    }
}
