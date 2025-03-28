package inheritance;

public class CarChild extends Vehicle {
    public String modelName = "Mustang";

    public static void main(String[] args) {
        CarChild obj = new CarChild();

        // access the vehicle class variables in here

        System.out.println("The brand name is " + obj.brand + " and " + "the model name is " + obj.modelName);

        // Access the method in vehicle class(parent class)

        obj.brandNaming();
    }
}
