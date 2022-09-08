/*
 * Copyright 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

public class AufgabenLotto {

    public static void main(String[] args) {

        String[] lottoschein = new String[49];

        //befuellen mit Zahlen
        for (int i = 0; i < lottoschein.length; i++) {
            lottoschein[i] = String.valueOf(i + 1);
        }
        printLottoschein(lottoschein);
        leseTippsEin(lottoschein);
        printLottoschein(lottoschein);
        int[] zahlen = ziehung();
        auswertung(zahlen, lottoschein);
    }

    public static void printLottoschein(String[] lottoschein) {
        // Lottschein ausgeben
        for (int i = 0; i < lottoschein.length; i++) {
            //Wenn der Wert einstellig ist oder ein X enthält bitte mit extra Leerzeichen ausgeben
            if (i < 9 || lottoschein[i].equals("X")) {
                System.out.print(" " + lottoschein[i] + " ");
            } else {
                System.out.print(lottoschein[i] + " ");
            }
            // Nach jedem 7ten Wert einen Zeilenumbruch einfügen für 7x7 Layout
            if (i != 0 && (i + 1) % 7 == 0) {
                System.out.println();
            }

        }
    }

    public static void leseTippsEin(String[] lottoschein) {
        // Tipps auf Lottoschein eintragen
        System.out.println();
        System.out.println("Bitte geben Sie ihre 6 Tipps ein:");

        for (int i = 0; i < 6; i++) {
            int tipp = Utils.liesIntVonKonsole();
            while (tipp < 1 || tipp > 49 || lottoschein[tipp - 1].equals("X")) {
                System.out.println("Tipp ungültig bitte neu eingeben");
                tipp = Utils.liesIntVonKonsole();
            }
            lottoschein[tipp - 1] = "X";
            System.out.println("Nächster Tipp Bitte: ");
        }
    }

    public static int[] ziehung() {
        int[] ziehung = new int[6];
        for (int zahl = 0; zahl < 6; zahl++) {
            ziehung[zahl] = Utils.createIntZufallszahl(1, 49);
        }
        Utils.printIntArray(ziehung, "Das ist die Ziehung: ");
        return ziehung;
    }

    public static void auswertung(int[] ziehung, String[] lottoschein) {
        int anzahlRichtig = 0;
        for (int i = 0; i < ziehung.length; i++) {
            if (lottoschein[ziehung[i] - 1].equals("X")) {
                anzahlRichtig++;
            }
        }
        System.out.println("Du hast " + anzahlRichtig + " Richtige im Lotto!");
    }

}
