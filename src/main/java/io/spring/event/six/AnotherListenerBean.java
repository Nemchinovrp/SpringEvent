package io.spring.event.six;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherListenerBean {
    @EventListener
    public void handleContextEvent(MyAnotherEvent myEvent) {
        System.out.println("event received: " + myEvent);
    }
}