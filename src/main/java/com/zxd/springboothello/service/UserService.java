package com.zxd.springboothello.service;

import com.zxd.springboothello.mapper.UserMapper;
import com.zxd.springboothello.pojo.SCRM;
import com.zxd.springboothello.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SCRM scrm;

    @RequestMapping("/findUserById")
    public User findUserById(Integer id){
        User user=userMapper.findById(id);
        return user;
    }
    @RequestMapping("/findScrm")
    public String findScrm(){
        log.info("info: "+scrm.toString());
        System.out.println("git");
        return scrm.toString();
    }
}
