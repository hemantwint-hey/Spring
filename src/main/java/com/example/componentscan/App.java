package com.example.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //change here
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee=context.getBean("employee",Employee.class);
        System.out.println(employee.toString());
    }
}
