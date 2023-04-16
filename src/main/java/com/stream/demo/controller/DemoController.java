package com.stream.demo.controller;

import com.stream.demo.mode.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @ClassName controller
 * @Description //TODO
 * @Author lkk
 * Date 2023/04/16/14:19
 * @Version 1.0
 **/
@RestController
@RequestMapping("test")
public class DemoController {

    @Autowired
    private StreamBridge streamBridge;

/*    @Autowired
    private KafkaUtils kafkaUtils;*/

    @Autowired
    private  Processor processor;

    @PostMapping("/kafka01")
    public void sendKafka01() {
        User user = new User("李四", "12");
        streamBridge.send("test01", user);
    }

    /*@PostMapping("/kafka02")
    public void sendKafka02() {
        kafkaUtils.sendKakfaInfo();
    }*/


    @PostMapping("/rabbit01")
    public void rabbit01() throws UnsupportedEncodingException {
        User user = new User("李四", "12");
        processor.output().send(MessageBuilder.withPayload(user).build());
    }




}
