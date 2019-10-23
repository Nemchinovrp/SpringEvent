package io.spring.event.conversion_service;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateTimeConverter implements Converter<Date, LocalDateTime> {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }

    @Override
    public LocalDateTime convert(Date source) {
        return LocalDateTime.ofInstant(source.toInstant(),
                ZoneId.of("Canada/Pacific"));
    }
}
