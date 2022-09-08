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

public class Aufgabe8 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in).useLocale(Locale.GERMAN);

        //Variables
        double zahl1, zahl2, ergebnis;
        String operator;
        double[] ergenbisArray = new double[5];


        System.out.println("*-*-*-*-*-*-*-*");
        System.out.println("Taschenrechner");
        System.out.println("*-*-*-*-*-*-*-*");

        System.out.println("Operatorenliste: ");
        System.out.println("+ Addition");
        System.out.println("- Subtraktion");
        System.out.println("* Multiplikation");
        System.out.println("/ Divison");
        System.out.println("% Modulo");


        for (int i = 0; i < ergenbisArray.length; i++) {
            //Input
            System.out.println("Gebe den Operator ein: ");
            operator = input.next();
            System.out.println("Gebe die erste Zahl ein: ");
            zahl1 = input.nextDouble();
            System.out.println("Gebe nun die zweite Zahl ein: ");
            zahl2 = input.nextDouble();

            ergenbisArray[i] = berechneErgebnis(zahl1, zahl2, operator);
            //Remove Decimals
            if (ergenbisArray[i] % 1 == 0)
                System.out.println((int) ergenbisArray[i]);
            else System.out.println(ergenbisArray[i]);
        }
        printArray(ergenbisArray);

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
            case "%":
                return zahl1 % zahl2;
            case "^":
                return xHochY((int) zahl1, (int) zahl2);
            default:
                System.out.println("Eingabe ungültig!");
                return 0;
        }
    }

    public static int xHochY(int zahl1, int zahl2) {
        int ergebnis = 1;
        if (zahl1 > 0 && zahl2 == 0) {
            return ergebnis;
        } else if (zahl1 == 0 && zahl2 >= 1) {
            return 0;
        } else {
            for (int i = 0; i < zahl2; i++) {
                ergebnis = ergebnis * zahl1;
            }
            return ergebnis;
        }
    }

    public static void printArray(double[] array) {
        System.out.println("Ergebnisse: ");
        for (double erg : array
        ) {
            System.out.println(erg);
        }
    }
}
