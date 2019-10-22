package io.spring.event.six;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ListenerBean {
    @EventListener
    public MyAnotherEvent handleContextEvent(MyEvent myEvent) {
        System.out.println("event received: " + myEvent);
        return new MyAnotherEvent(LocalDateTime.now());
    }
}