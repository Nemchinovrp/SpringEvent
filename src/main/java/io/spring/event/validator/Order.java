package io.spring.event.validator;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
    private Date date;
    private BigDecimal price;
}
