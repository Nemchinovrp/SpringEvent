package io.spring.event.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.math.BigDecimal;

public class OrderValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Order.class == aClass;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "date", "date.empty");
        ValidationUtils.rejectIfEmpty(errors, "price", "price.empty");
        Order order = (Order) target;
        if (order.getPrice() != null &&
                order.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            errors.rejectValue("price", "price.invalid");
        }
    }
}
