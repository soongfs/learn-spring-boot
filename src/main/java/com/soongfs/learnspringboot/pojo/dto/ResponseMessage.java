package com.soongfs.learnspringboot.pojo.dto;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.tags.EditorAwareTag;

public class ResponseMessage<T> {
    private Integer code;
    private String message;
    private T data;

    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 接口请求成功
    public static  <T> ResponseMessage success(T data) {
        return new ResponseMessage(HttpStatus.OK.value(), "success!", data);
    }

    // 接口请求成功
    public static  <T> ResponseMessage success() {
        return new ResponseMessage(HttpStatus.OK.value(), "success!", null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
