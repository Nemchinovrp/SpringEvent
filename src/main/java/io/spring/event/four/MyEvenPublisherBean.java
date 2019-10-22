package io.spring.event.four;

import io.spring.event.three.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEvenPublisherBean {
    @Autowired
    ApplicationEventPublisher publisher;

    public void sendMsg(String msg) {
        publisher.publishEvent(new MyEvent(this, msg));

    }
}
