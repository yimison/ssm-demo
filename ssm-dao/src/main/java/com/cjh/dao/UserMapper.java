package com.cjh.dao;

import org.springframework.stereotype.Component;

import com.cjh.model.User;

@Component
public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);
}