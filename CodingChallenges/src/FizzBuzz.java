/*
The first real CodingChallenge, which I did. This one is for the site "EntwicklerHeld", but will be similar or even the same on other sites that offer CodingChallenges.  This small project is the FizzBuzz Challenge, which outputs "Fizz" when a value is dividable by 3 and outputs "Buzz" when a value is dividable by 5. When a value is dividable by 3 and 5, "FizzBuzz" is output.
 */

public class FizzBuzz {

    //Not part of the challenge / built in to execute in IDE
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(fizzbuzz(i));
        }
    }

    //Official part of the Challenge
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
