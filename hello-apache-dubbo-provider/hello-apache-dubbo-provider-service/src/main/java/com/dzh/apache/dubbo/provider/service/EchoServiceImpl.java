package com.dzh.apache.dubbo.provider.service;

import com.dzh.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Description TODO
 * @ClassName EchoServiceImpl
 * @Author DingZuoHeng
 * @Date 2020/3/1
 * @Version 1.0
 **/
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String string) {
        return "Echo Hello Dubbo " + string;
    }
}
