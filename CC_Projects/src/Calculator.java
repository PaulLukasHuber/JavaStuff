/*
This is a simple calculator from the Java projects of Codecademy.
The functions are simple and self-explanatory. There is no external input.
The calculator can do addition and subtraction, as well as multiplication and division, and modulo.
 */

public class Calculator {

    public Calculator() {

    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }
}

