package com.jo.dy.ot.dao;

import com.jo.dy.ot.entity.User;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface UserMapper extends Mapper<User>, InsertListMapper<User> {

}
