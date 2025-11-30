package calculator;

public class Calculator {

    public double sumNumbers(double a, double b) {
        return a + b;
    }

    public double subNumber(double a, double b) {
        return a - b;
    }

    public double multNumbers(double a, double b) {
        return a * b;
    }

    public double divNumbers(double a, double b) {
        if (b ==0) {
            System.out.println("Error: Division by zero");
            return 0;
        } else {
            return a / b;
        }
    }

}
