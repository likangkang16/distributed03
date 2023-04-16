package com.stream.demo.rabbit;

import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @ClassName RabbitUtils
 * @Description //TODO
 * @Author lkk
 * Date 2023/04/16/17:11
 * @Version 1.0
 **/
@Component
public class RabbitUtils implements Processor {
    /**
     * @return input channel.
     */
    @Override
    public SubscribableChannel input() {
        return null;
    }

    /**
     * @return output channel
     */
    @Override
    public MessageChannel output() {
        return null;
    }
}
