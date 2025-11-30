package calculator;

import java.util.logging.Logger;

public class Calculator {

    Logger logger = Logger.getLogger(Calculator.class.getName());

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
            logger.warning("Division by zero attempted.");
            return 0;
        } else {
            return a / b;
        }
    }

}
