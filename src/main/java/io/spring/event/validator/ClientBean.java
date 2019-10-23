package io.spring.event.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.DataBinder;

import java.util.Locale;

public class ClientBean {
    @Autowired
    private Order order;
    @Autowired
    private MessageSource messageSource;

    public void processOrder() {
        if (validateOrder()) {
            System.out.println("processing " + order);
        } else {
            System.out.println("Invalid order - " + order.toString());
        }
    }

    private boolean validateOrder() {
        DataBinder dataBinder = new DataBinder(order);
        dataBinder.addValidators(new OrderValidator());
        dataBinder.validate();

        if (dataBinder.getBindingResult().hasErrors()) {
            System.out.println(messageSource.getMessage("order.invalid",
                    null, Locale.US));
            dataBinder.getBindingResult().getAllErrors().stream().
                    forEach(e -> System.out.println(messageSource
                            .getMessage(e, Locale.US)));
            return false;
        }
        return true;
    }
}
