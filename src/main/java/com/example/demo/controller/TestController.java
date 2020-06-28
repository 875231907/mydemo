package com.example.demo.controller;


//import com.example.demo.service.UserService;

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
        ThreadLocal threadLocal = new ThreadLocal();
//        userService.methodB();
        return "'" + "'";
    }

    @ApiOperation(value = "testDemo")
    @GetMapping(value = "/testA")
    public String testA() {
//        userService.methodA();
        return "Hello World";
    }

    public static void main(String[] args) {
        Integer code = 0;
        if (code != null && code > 0 && code < 20) {
            System.out.println(1);
        }
    }

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int states = minutesToTest / minutesToDie + 1;
        return (int) Math.ceil(Math.log(buckets) / Math.log(states));

    }


}
