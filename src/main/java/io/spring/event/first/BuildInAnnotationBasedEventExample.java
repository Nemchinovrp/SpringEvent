package io.spring.event.first;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.spring.event.first.")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class BuildInAnnotationBasedEventExample {
    private final ListenerBean listenerBean;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                BuildInAnnotationBasedEventExample.class);
        System.out.println("----------- stopping context ------------");
        context.stop();
        System.out.println("-----------------------------------");
        System.out.println("------------ starting context -----------");
        context.start();
        System.out.println("-----------------------------------");
        System.out.println("------------ closing context -------------");
        context.close();
        System.out.println("-----------------------------------");
    }
}
