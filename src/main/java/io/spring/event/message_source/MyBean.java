package io.spring.event.message_source;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;

public class MyBean implements MessageSourceAware {
    private MessageSource messageSource;

    public void doSomething() {
        System.out.println(messageSource.getMessage("app.name", new Object[]{"Joe"},
                Locale.getDefault()));
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;

    }
}
