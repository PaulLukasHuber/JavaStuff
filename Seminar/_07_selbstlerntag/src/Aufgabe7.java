/*
 * Copyright 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

import java.util.Locale;
import java.util.Scanner;

public class Aufgabe7 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in).useLocale(Locale.GERMAN);

        //Variables
        double zahl1, zahl2, ergebnis;
        String operator;

        //Input
        System.out.println("Gebe die erste Zahl ein: ");
        zahl1 = input.nextDouble();
        System.out.println("Gebe nun den Operator ein: ");
        operator = input.next();
        System.out.println("Gebe nun die zweite Zahl ein: ");
        zahl2 = input.nextDouble();


        //Casting to int if no decimals
        ergebnis = berechneErgebnis(zahl1, zahl2, operator);
        if (ergebnis % 1 == 0)
            System.out.print((int) ergebnis);
        else System.out.println(ergebnis);
    }

    public static double berechneErgebnis(double zahl1, double zahl2, String operator) {
        switch (operator) {
            case "+":
                return zahl1 + zahl2;
            case "-":
                return zahl1 - zahl2;
            case "*":
                return zahl1 * zahl2;
            case "/":
                return zahl1 / zahl2;
            case "^":
                return xHochY((int) zahl1, (int) zahl2);
            default:
                System.out.println("Eingabe ungültig!");
                System.out.println("Gebe 0.0 aus: ");
                return 00;
        }
    }

    public static int xHochY(int zahl1, int zahl2) {
        int ergebnis = 1;

        for (int i = 0; i < zahl2; i++) {
            ergebnis = ergebnis * zahl1;
        }
        return ergebnis;
    }
}

