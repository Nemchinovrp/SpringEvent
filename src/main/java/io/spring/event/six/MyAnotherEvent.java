package io.spring.event.six;

import java.time.LocalDateTime;

public class MyAnotherEvent {
    private LocalDateTime time;

    public MyAnotherEvent(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MyAnotherEvent{" +
                "time=" + time +
                '}';
    }
}