package io.spring.event.four;

public class MyEvent {
    private final String msg;


    public MyEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
