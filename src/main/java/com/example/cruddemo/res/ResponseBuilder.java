package com.example.cruddemo.res;

import com.example.cruddemo.domain.DbHdkUser;

import java.util.List;

public class ResponseBuilder {

    public static <T>Res<T> build(T data) {
        Res<T> res=new Res<>();
        res.setData(data);
        res.setStatusCode("200");
        res.setStatusDesc(".");
        res.setTimeStamp(System.currentTimeMillis());
        return res;
    }
}
