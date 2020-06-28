package com.example.demo.controller;


//import com.example.demo.service.UserService;

import com.alibaba.fastjson.JSON;
import com.example.demo.tools.UserTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;


/**
 * @author MaSheng
 * @version V1.0
 * @Type TestController
 * @Desc
 * @date 2019/12/30
 */
@RestController
@RequestMapping("/test")
@Api
public class TestController {
//    @Autowired
//    UserService userService;

    @ApiOperation(value = "testB")
    @GetMapping(value = "/testB")
    public String testB() {
//        userService.methodB();
        System.out.println(JSON.toJSONString(UserTool.getUserTool()));
        return JSON.toJSONString(UserTool.getUserTool());
    }

    @ApiOperation(value = "testDemo")
    @GetMapping(value = "/testA")
    public String testA() {
//        userService.methodA();
        return "Hello World";
    }
}
