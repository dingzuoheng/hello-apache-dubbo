package com.dzh.apache.dubbo.consumer.controller;

import com.dzh.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @ClassName EchoController
 * @Author DingZuoHeng
 * @Date 2020/3/1
 * @Version 1.0
 **/
@RestController
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string);
    }


}
