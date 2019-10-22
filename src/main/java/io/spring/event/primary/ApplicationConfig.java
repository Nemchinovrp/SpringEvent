package io.spring.event.primary;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
    @Bean(autowire = Autowire.BY_TYPE)
    public OrderService orderService() {
        return new OrderService();
    }

    @Bean
    @Primary
    public Dao daoA() {
        return new DaoA();
    }

    @Bean
    public Dao daoB() {
        return new DaoB();
    }

    public static void main(String[] args)  {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder("122");
    }
}