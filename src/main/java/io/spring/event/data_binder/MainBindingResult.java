package io.spring.event.data_binder;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class MainBindingResult {
    public static void main(String[] args) {

        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("anInt", "10x"); // 10x cannot be converted to int type

        TestBean testBean = new TestBean();
        DataBinder db = new DataBinder(testBean);

        db.bind(mpv);
        db.getBindingResult().getAllErrors().forEach(System.out::println);
        System.out.println(testBean);
    }
}
