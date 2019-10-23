package io.spring.event.conversion_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;

import java.time.LocalDateTime;
import java.util.Date;

public class ClientBean {
    private final Date date;
    @Autowired
    private ConversionService conversionService;

    public ClientBean(Date date) {
        this.date = date;
    }

    public void showLocalDateTime() {
        LocalDateTime dateTime = conversionService.convert(date, LocalDateTime.class);
        System.out.println(dateTime);
    }
}
