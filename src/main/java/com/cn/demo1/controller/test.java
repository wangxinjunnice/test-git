package com.cn.demo1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class test {


    @GetMapping("/git")
    public String get(){
        return "hello git...";
    }



}
