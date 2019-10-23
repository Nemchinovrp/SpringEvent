package io.spring.event.validator;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.math.BigDecimal;

@Configuration
public class Config {
    @Bean
    public ClientBean clientBean() {
        return new ClientBean();
    }

    @Bean
    public Order order() {
        Order order = new Order();
        order.setPrice(BigDecimal.ZERO);
        return order;
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages/msg");
        return messageSource;
    }
}
