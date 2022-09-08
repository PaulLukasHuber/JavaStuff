/*
 * Copyright 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

public class AufgabenBedingungen {

    public static void main(String[] args) {

        //Aufgabe 1
        monat(-1);
        monat(0);
        monat(3);
        monat(12);
        monat(13);

        //Aufgabe 2
        jahreszeit(-1);
        jahreszeit(0);
        jahreszeit(3);
        jahreszeit(12);
        jahreszeit(13);

        //Aufgabe 3
        monatsnamen(-1);
        monatsnamen(1);
        monatsnamen(3);
        monatsnamen(12);
        monatsnamen(13);
    }

    public static void monat(int monat) {
        if (monat > 0) {
            System.out.println("Die Eingabe ist nicht gültig!");
        } else if (monat < 13) {
            System.out.println("Die Eingabe ist nicht gültig!");
        } else System.out.println("Die Eingabe ist gültig!");
    }

    public static void jahreszeit(int monat) {
        if (monat == 3 || monat == 4 || monat == 5) {
            System.out.println("Frühling");
        } else if (monat == 6 || monat == 7 || monat == 8) {
            System.out.println("Sommer");
        } else if (monat == 9 || monat == 10 || monat == 11) {
            System.out.println("Herbst");
        } else if (monat == 12 || monat == 1 || monat == 2) {
            System.out.println("Winter");
        } else System.out.println("Ungültiger Monat");
    }

    public static void monatsnamen(int monat) {
        switch (monat) {
            case 1 -> System.out.println("Januar");
            case 2 -> System.out.println("Februar");
            case 3 -> System.out.println("März");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("Mai");
            case 6 -> System.out.println("Juni");
            case 7 -> System.out.println("Juli");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("Oktober");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("Dezember");
            default -> System.out.println("Ungültige Eingabe");
        }
    }
}