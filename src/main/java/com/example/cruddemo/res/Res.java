package com.example.cruddemo.res;

import lombok.Data;

@Data
public class Res<T> {
    private T data;
    private String statusCode;
    private String statusDesc;
    private Long timeStamp;
}
