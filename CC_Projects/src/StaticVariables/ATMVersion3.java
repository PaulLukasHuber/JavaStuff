/*
 * MIT License
 *
 * Copyright (c) 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package StaticVariables;

public class ATMVersion3 {
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATMVersion3(int inputMoney) {
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    // Write your averageMoney() method here

    public static void main(String[] args) {

        System.out.println("Total number of ATMs: " + ATMVersion3.numATMs);
        ATMVersion3 firstATM = new ATMVersion3(1000);
        ATMVersion3 secondATM = new ATMVersion3(500);
        System.out.println("Total number of ATMs: " + ATMVersion3.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATMVersion3.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATMVersion3.totalMoney);

        // Call averageMoney() here

    }

}
