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

package Superhelden;

public class StarterListe {

    public static void main(String[] args) {

        Superheld ironman = new Ironman(2);
        Superheld batman = new Batman(8);
        Superheld spiderman = new Spiderman(4);
        Superheld aquaman = new Aquaman(1);
        Superheld loki = new Superheld("Loki", 40, "Verrat");

        Heldenliste heldenliste = new Heldenliste();

        heldenliste.eintragen(ironman);
        heldenliste.eintragen(batman);
        heldenliste.eintragen(spiderman);
        heldenliste.eintragen(aquaman);
        heldenliste.eintragen(loki);

        System.out.println(heldenliste.getAnzahlHelden());

        heldenliste.entfernen(batman);
        System.out.println(heldenliste.getAnzahlHelden());

        System.out.println(heldenliste.istVorhanden(loki));

    }
}
