package io.spring.event.data_binder;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class Main {
    public static void main(String[] args) {
        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("anInt", "15");

        TestBean testBean = new TestBean();
        DataBinder db = new DataBinder(testBean);

        db.bind(mpv);
        System.out.println(testBean);
    }
}
