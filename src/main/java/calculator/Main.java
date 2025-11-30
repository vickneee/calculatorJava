package calculator;

public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        double summation = cal.sumNumbers(4, 6);
        System.out.println(summation);

        double subtraction = cal.subNumber(8, 3);
        System.out.println(subtraction);

        double multiplication = cal.multNumbers(5, 7);
        System.out.println(multiplication);

        double division = cal.divNumbers(20, 4);
        System.out.println(division);

        double divisionByZero = cal.divNumbers(10, 0);
        System.out.println(divisionByZero);
    }
}
