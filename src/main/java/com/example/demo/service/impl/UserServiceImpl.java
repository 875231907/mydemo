//package com.example.demo.service.impl;
//
//import com.example.demo.dto.user;
//import com.example.demo.mapper.UserMapper;
//import com.example.demo.service.UserService;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.Resource;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.Set;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.LinkedBlockingQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//
//
///**
// * @author MaSheng
// * @version V1.0
// * @Type UserServiceImpl
// * @Desc
// * @date 2019/12/30
// */
//@Service
//public class UserServiceImpl implements UserService {
//    @Resource
//    UserMapper uMapper;
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public int methodA() {
//        user u = new user();
//        u.setId("100");
//        u.setName("123");
//        u.setPassword("321");
//        uMapper.insert(u);
//        methodB();
//        return 1;
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public int methodB() {
//        user u = new user();
//        u.setId("200");
//        u.setName("123");
//        u.setPassword("321");
//        uMapper.insert(u);
////        methodA();
//        int a = 1/0;
//
//        return 1;
//    }
//
//
//    public static void main(String[] args) {
//        Map<Object, String> hashMap = new ConcurrentHashMap<>(16);
//        hashMap.put(1,"1");
//        hashMap.put(2,"2");
//        hashMap.put(3,"json2");
//        hashMap.put(4,"4");
//        hashMap.put(5,"5");
//        hashMap.put(6,"6");
//        hashMap.put(7,"7");
//        hashMap.put("xc","json1");
//        hashMap.put('z',"9");
//        hashMap.put("name1", "josan1");
//        hashMap.put("name2", "josan2");
//        hashMap.put("name3", "josan3");
//        for (Object o:hashMap.keySet()) {
//            System.out.println(hashMap.get(o));
//        }
////        ThreadPoolExecutor threadPoolExecutor =
////                new ThreadPoolExecutor(1, 3, 3, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
//
//
//    }
//
//}
