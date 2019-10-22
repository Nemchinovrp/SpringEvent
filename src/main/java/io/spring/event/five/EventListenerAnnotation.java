package io.spring.event.five;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerAnnotation {

    @EventListener({ContextRefreshedEvent.class, ContextStoppedEvent.class,
            ContextStartedEvent.class})
    public void handleContextEvent() {
        System.out.println("context event fired: ");
    }
}
