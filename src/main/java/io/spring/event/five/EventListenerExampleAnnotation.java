package io.spring.event.five;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.spring.event.five.")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class EventListenerExampleAnnotation {
    private final EventListenerAnnotation eventListenerAnnotation;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventListenerExampleAnnotation.class);
        System.out.println("-- stopping context --");
        context.stop();
        System.out.println("-- starting context --");
        context.start();
    }
}