package com.chumenkanlian.service;

import com.chumenkanlian.entity.User;

import java.util.List;

public interface UserService {
	
	int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    //这个方式我自己加的
    List<User> selectAllUser();
}
