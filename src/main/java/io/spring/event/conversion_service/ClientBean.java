package io.spring.event.conversion_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;

import java.time.LocalDateTime;
import java.util.Date;

public class ClientBean {
    @Autowired
    private ConversionService conversionService;
    private final Date date;

    public ClientBean(Date date) {
        this.date = date;
    }

    public void showLocalDateTime() {
        LocalDateTime dateTime = conversionService.convert(date, LocalDateTime.class);
        System.out.println(dateTime);
    }
}
