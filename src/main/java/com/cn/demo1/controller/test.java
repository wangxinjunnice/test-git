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

    @GetMapping("/list")
    public String list(){
        return "hello list...";
    }

    @GetMapping("/gits")
    public String gets(){
        return "hello git...";
    }

    @GetMapping("/allTest")
    public String allTest(){
        return "allTest git...";
    }

    @GetMapping("/all")
    public String all(){
        return "all git...";
    }





}
