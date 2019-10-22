package io.spring.event.six;

public class MyEvent {
    private String msg;

    public MyEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "msg='" + msg + '\'' +
                '}';
    }
}