package io.spring.event.primary;

public class DaoA implements Dao {
    @Override
    public void saveOrder(String orderId) {
        System.out.println("DaoA Order saved " + orderId);
    }
}
