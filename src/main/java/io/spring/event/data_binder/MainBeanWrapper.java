package io.spring.event.data_binder;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;

public class MainBeanWrapper {
    public static void main(String[] args) {
        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("aString", "SomeString");
        mpv.add("anInt", "10x");

        BeanWrapper bw = new BeanWrapperImpl(new TestBean());
        bw.setPropertyValues(mpv);
        System.out.println(bw.getWrappedInstance());
    }
}
