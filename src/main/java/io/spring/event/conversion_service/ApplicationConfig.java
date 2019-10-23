package io.spring.event.conversion_service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(Config.class);

        ClientBean clientBean = context.getBean(ClientBean.class);
        clientBean.showLocalDateTime();
    }
}
