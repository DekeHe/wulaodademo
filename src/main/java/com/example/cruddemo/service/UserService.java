package com.example.cruddemo.service;

import com.example.cruddemo.dao.DbHdkUserMapper;
import com.example.cruddemo.domain.DbHdkUser;
import com.example.cruddemo.domain.DbHdkUserExample;
import com.example.cruddemo.req.UserReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private DbHdkUserMapper dbHdkUserMapper;

    public List<DbHdkUser> selectDbHdkUser(UserReq req) {
        req.validate();

        DbHdkUserExample example=new DbHdkUserExample();
        example.createCriteria().andNameEqualTo(req.getName());
        example.createCriteria().andAgeEqualTo(req.getAge());
        example.createCriteria().andSexEqualTo(req.getSex());
        example.createCriteria().andPhoneEqualTo(req.getPhone());
        example.createCriteria().andCityEqualTo(req.getCity());
        return dbHdkUserMapper.selectByExample(example);
    }
}
