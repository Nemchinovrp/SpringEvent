package io.spring.event.three;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListenerBean {
    @EventListener
    public void onMyEvent(MyEvent event) {
        System.out.print("event received: " + event.getMsg());
        System.out.println(" -- source: " + event.getSource());
    }
}
