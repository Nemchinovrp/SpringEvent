package io.spring.event.six;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.spring.event.six.")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class EventListenerWithAnother {
    private final ListenerBean listenerBean;
    private final AnotherListenerBean anotherListenerBean;


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        EventListenerWithAnother.class);
        context.publishEvent(new MyEvent("test message 1"));
    }
}