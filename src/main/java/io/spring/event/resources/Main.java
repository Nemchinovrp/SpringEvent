package io.spring.event.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("io.spring.event.resources");
        ResourceLoaderService loader = (ResourceLoaderService) ctx.getBean("resourceLoaderService");
        try {
            loader.showResourceDataUsingRoot();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("** Resource loader using file path **");

        try {
            loader.showResourceDataUsingFilePath();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("** Resource loader using class path **");

        try {
            loader.showResourceDataUsingClassPath();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("** Resource loader using URL **");

        try {
            loader.showResourceDataUsingURL();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
