package car.constructor;

public class Car {
    private  injection injection;

    public Car(injection injection) {
        this.injection = injection;
    }

    public  void displayDetails(){
        System.out.println("Car Details:"+ injection.toString());
    }
}
