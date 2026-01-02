package car.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationConstructionInjection.xml");
        Car mcar=(Car) context.getBean("Car");
        mcar.displayDetails();
    }
}
