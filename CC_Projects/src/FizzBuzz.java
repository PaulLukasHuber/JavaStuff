/*
Another CC project that can be found similarly at CodingChallenges.  This small project is the FizzBuzz Challenge, which outputs "Fizz" when a value is dividable by 3 and outputs "Buzz" when a value is dividable by 5. When a value is dividable by 3 and 5, "FizzBuzz" is output.
 */

public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }

    }
}

