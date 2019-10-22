package io.spring.event.conversion_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;

@Configuration
public class Config {
    @Bean
    public ConversionService conversionService() {
        DefaultConversionService service = new DefaultConversionService();
        service.addConverter(new DateToLocalDateTimeConverter());
        return service;
    }

    @Bean
    public ClientBean clientBean() {
        return new ClientBean(new Date());
    }
}
