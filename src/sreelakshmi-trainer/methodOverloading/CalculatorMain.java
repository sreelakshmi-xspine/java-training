package methodOverloading;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(5, 15, 25));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
    }
}
