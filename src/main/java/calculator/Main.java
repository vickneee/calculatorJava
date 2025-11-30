package calculator;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class.getName());
        Calculator cal = new Calculator();

        String result = "Hello, Calculator!";
        logger.info(() -> result);
        double summation = cal.sumNumbers(4, 6);
        String summationStr = "The sum of 4 and 6 is: " + summation;
        logger.info(() -> String.format(summationStr));

        double subtraction = cal.subNumber(8, 3);
        String subtractionStr = "The subtraction of 8 and 3 is: " + subtraction;
        logger.info(() -> String.format(subtractionStr));

        double multiplication = cal.multNumbers(5, 7);
        String multiplicationStr = "The multiplication of 5 and 7 is: " + multiplication;
        logger.info(() -> String.format(multiplicationStr));

        double division = cal.divNumbers(20, 4);
        String divisionStr = "The division of 20 by 4 is: " + division;
        logger.info(() -> String.format(divisionStr));

        double divisionByZero = cal.divNumbers(10, 0);
        String divisionByZeroStr = "The division of 10 by 0 is: " + divisionByZero;
        logger.info(() -> String.format(divisionByZeroStr));
    }
}
