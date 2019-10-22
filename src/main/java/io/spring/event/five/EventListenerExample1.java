package io.spring.event.five;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class EventListenerExample1 {
    @Bean
    AListenerBean listenerBean() {
        return new AListenerBean();
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventListenerExample1.class);
        System.out.println("-- stopping context --");
        context.stop();
        System.out.println("-- starting context --");
        context.start();

    }

    private static class AListenerBean {

        @EventListener({ContextRefreshedEvent.class, ContextStoppedEvent.class,
                ContextStartedEvent.class})
        public void handleContextEvent() {
            System.out.println("context event fired: ");
        }

    }
}
