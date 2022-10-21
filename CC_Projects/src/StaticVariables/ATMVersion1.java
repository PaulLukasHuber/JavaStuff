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

public class ATMVersion1 {


    // Step 2: Create your static variables here

    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATMVersion1(int inputMoney) {
        this.money = inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
        }
    }

    public static void main(String[] args) {
        // Step 1: Create your two ATMs here

        ATMVersion1 firstATM = new ATMVersion1(1000);
        ATMVersion1 secondATM = new ATMVersion1(500);

        // Step 3: Print your static variable in three different ways here

        System.out.println(ATMVersion1.totalMoney);
        System.out.println(firstATM.totalMoney);
        System.out.println(secondATM.totalMoney);
    }

}