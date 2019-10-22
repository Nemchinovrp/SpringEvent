package io.spring.event.three;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.spring.event.three")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CustomEventWithApplicationEvent {
    private final CustomListenerBean customListenerBean;
    private final MyEvenPublisherBean myEvenPublisherBean;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                CustomEventWithApplicationEvent.class);
        MyEvenPublisherBean bean = context.getBean(MyEvenPublisherBean.class);
        bean.sendMsg("A test message");
    }
}