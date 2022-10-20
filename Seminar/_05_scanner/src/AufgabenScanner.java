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

import java.util.Arrays;
import java.util.Scanner;

public class AufgabenScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String speicherName;
        String[] speicherArray = new String[5];

        speicherName = leseNamenEin();
        System.out.println(speicherName);

        System.out.println("Gib die Teilnehmerliste ein: ");
        speicherArray = eingabe();
        pruefen(speicherName, speicherArray);

        System.out.println("Gebe eine Jahreszahl ein: ");
        schaltjahr(input.nextInt());


    }

    //Aufgabe 1
    public static String leseNamenEin() {
        String name;
        System.out.println("Gib den Namen des Teilenehmers ein: ");
        name = Utils.liesStringVonKonsole();
        System.out.println(name);
        return name;
    }

    //Aufgabe 2
    public static String[] eingabe() {
        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Gib einen Namen ein: ");
            array[i] = leseNamenEin();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    //Aufgabe 3
    public static void pruefen(String name, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                System.out.println(name + " ist ein(e)Schulungsteilnehmer(in).");
                break;
            } else if (i == array.length - 1) {
                System.out.println(name + " ist nicht unter den Schulungsteilnehmer*innen");
            }
        }
    }

    //Aufagbe 4
    public static void schaltjahr(int jahr) {
        if (0 == jahr % 4) {
            System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr");
        } else System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr");
    }
}
