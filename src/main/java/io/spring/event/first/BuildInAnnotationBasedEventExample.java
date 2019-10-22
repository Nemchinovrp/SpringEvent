package io.spring.event.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuildInAnnotationBasedEventExample {
    @Bean
    ListenerBean listenerBean() {
        return new ListenerBean();
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                BuildInAnnotationBasedEventExample.class);
        System.out.println("-- stopping context --");
        context.stop();
        System.out.println("-- starting context --");
        context.start();
        System.out.println("-- closing context --");
        context.close();
    }
}
