package io.spring.event.four;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.spring.event.four")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CustomEventWithoutApplicationEvent {
    private final CustomListenerBean aListenerBean;
    private final MyEvenPublisherBean myEvenPublisherBean;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                CustomEventWithoutApplicationEvent.class);
        MyEvenPublisherBean bean = context.getBean(MyEvenPublisherBean.class);
        bean.sendMsg("A test message");
    }
}