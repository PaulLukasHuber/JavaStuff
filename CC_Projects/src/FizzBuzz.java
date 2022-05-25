/*
Another CC project, which I rebuilt afterwards to meet a code challenge from "EntwicklerHeld". This small project is the FizzBuzz Challenge, which outputs "Fizz" when a value is divisible by 3 and outputs "Buzz" when a value is divisible by 5. When a value is divisible by 3 and 5, "FizzBuzz "is output.
 */

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fizzbuzz(i));
        }
    }

    static String fizzbuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else return String.valueOf(number);
    }
}
