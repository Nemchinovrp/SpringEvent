package io.spring.event.first;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class ListenerBean {

    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent event) {
        System.out.print("context refreshed event fired: ");
        System.out.println(event);
    }

    @EventListener
    public void handleContextStarted(ContextStartedEvent event) {
        System.out.print("context started event fired: ");
        System.out.println(event);
    }

    @EventListener
    public void handleContextStopped(ContextStoppedEvent event) {
        System.out.print("context stopped event fired: ");
        System.out.println(event);
    }

    @EventListener
    public void handleContextClosed(ContextClosedEvent event) {
        System.out.print("context  closed event fired: ");
        System.out.println(event);
    }

}
