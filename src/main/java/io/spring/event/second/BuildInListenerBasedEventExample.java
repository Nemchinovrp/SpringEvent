package io.spring.event.second;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuildInListenerBasedEventExample {
 /*   @Bean
    ListenerBeanRefresh listenerBean() {
        return new ListenerBeanRefresh();
    }
*/
    @Bean
    ListenerBeanStartContext listenerBeanStartContext() {
        return new ListenerBeanStartContext();
    }
    @Bean
    ListenerContextClose listenerContextClose() {
        return new ListenerContextClose();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                BuildInListenerBasedEventExample.class);

    }

}
