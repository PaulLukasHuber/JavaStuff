/*
Another CC project, in this one you should understand and use loops to find out the prime numbers from a list of integers and then return them.
 */

// Import statement:

import java.util.ArrayList;

class PrimeDirective {

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        //Prime Numbers
        System.out.println(pd.onlyPrimes(numbers));

    }

    // Add your methods here:
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }
}
