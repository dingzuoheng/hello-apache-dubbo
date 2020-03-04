package com.dzh.apache.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Description TODO
 * @ClassName ConsumerApplication
 * @Author DingZuoHeng
 * @Date 2020/3/1
 * @Version 1.0
 **/
//@RefreshScope
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
