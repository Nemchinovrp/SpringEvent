package io.spring.event.second;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

public class ListenerBeanStartContext implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("-----------------------------------");
        System.out.print("Context refreshed event fired: ");
        System.out.println(contextStartedEvent);
        System.out.println("-----------------------------------");
    }
}
