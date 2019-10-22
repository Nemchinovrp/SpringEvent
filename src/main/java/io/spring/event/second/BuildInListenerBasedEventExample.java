package io.spring.event.second;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuildInListenerBasedEventExample {
    @Bean
    ListenerBean listenerBean() {
        return new ListenerBean();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                BuildInListenerBasedEventExample.class);

    }

}
