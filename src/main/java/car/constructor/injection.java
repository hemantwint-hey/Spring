package car.constructor;

public class injection {
    private String make;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "injection{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

//    public injection(String make, String model) {
//        this.make = make;
//        this.model = model;
//    }
}
