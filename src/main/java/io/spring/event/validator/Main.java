package io.spring.event.validator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        Config.class);

        ClientBean bean = context.getBean(ClientBean.class);
        bean.processOrder();
    }
}
