package io.spring.event.three;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEvenPublisherBean {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void sendMsg(String msg) {
        publisher.publishEvent(new MyEvent(this, msg));
    }
}
