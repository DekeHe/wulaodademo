package com.example.cruddemo.req;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Data
public class UserReq extends PageReq{
    private String name;
    private Integer age;
    private String sex;
    private String phone;
    private String city;

    public void validate() {
        if(!StringUtils.hasText(name)) throw new RuntimeException("name cannot be empty");
        if(Objects.isNull(age)) throw new RuntimeException("age cannot be empty");
        if(!StringUtils.hasText(sex)) throw new RuntimeException("sex cannot be empty");
        if(!StringUtils.hasText(phone)) throw new RuntimeException("phone cannot be empty");
        if(!StringUtils.hasText(city)) throw new RuntimeException("city cannot be empty");
    }
}
