package com.dzh.apache.dubbo.provider.service;

import com.dzh.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Description 此处的@Service注解不是spring的，而是org.apache.dubbo.config.annotation.Service
 * @ClassName EchoServiceImpl
 * @Author DingZuoHeng
 * @Date 2020/3/1
 * @Version 1.0
 **/
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;
    @Override
    public String echo(String string) {

        return "端口："+port+" . Echo Hello Dubbo " + string;
    }
}
