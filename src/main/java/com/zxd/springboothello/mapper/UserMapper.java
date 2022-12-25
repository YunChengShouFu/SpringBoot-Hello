package com.zxd.springboothello.mapper;

import com.zxd.springboothello.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

public interface UserMapper {
    @Select("select id as id,username as username,password as password,sex as sex from user where id=#{id}")
    User findById(@Param("id") Integer id);
}
