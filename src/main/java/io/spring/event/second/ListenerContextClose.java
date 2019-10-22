package io.spring.event.second;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ListenerContextClose implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        System.out.println("-----------------------------------");
        System.out.print("Context close event fired: ");
        System.out.println(contextClosedEvent);
        System.out.println("-----------------------------------");
    }
}
