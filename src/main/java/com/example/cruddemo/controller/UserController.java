package com.example.cruddemo.controller;

import com.example.cruddemo.domain.DbHdkUser;
import com.example.cruddemo.req.UserReq;
import com.example.cruddemo.res.Res;
import com.example.cruddemo.res.ResponseBuilder;
import com.example.cruddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserService userService;

    //
    //用户查询
    @GetMapping(value="/selectDbHdkUser")
    public Res<List<DbHdkUser>> selectDbHdkUser(@RequestBody UserReq req) {
        return ResponseBuilder.build(userService.selectDbHdkUser(req));
    }
}
