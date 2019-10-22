package io.spring.event.second;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ListenerBean implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("-----------------------------------");
        System.out.print("Context refreshed event fired: ");
        System.out.println(event);
        System.out.println("-----------------------------------");
    }
}
