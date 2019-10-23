package io.spring.event.message_source;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class MessageSourceAwareExample {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
        //uncomment next line to change the locale
        Locale.setDefault(Locale.FRANCE);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        MyBean bean = context.getBean(MyBean.class);
        bean.doSomething();
    }
}
