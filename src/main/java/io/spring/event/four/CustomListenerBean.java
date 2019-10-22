package io.spring.event.four;

import io.spring.event.three.MyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListenerBean {
    @EventListener
    public void onMyEvent(MyEvent event) {
        System.out.print("event received: " + event.getMsg());
    }
}
