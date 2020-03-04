package com.dzh.apache.dubbo.consumer.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @ClassName TestConfig
 * @Author DingZuoHeng
 * @Date 2020/3/3
 * @Version 1.0
 **/
@RefreshScope
@RestController
public class TestConfigController {

    @Value(value = "${user.name}")
    private String username;


    @GetMapping("/testConfig/{name}")
    public String testConfig233(@PathVariable String name){
        System.out.println(username);
        return "配置为："+username+"  参数："+name;
    }
}
