/*
 * Copyright 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package Superhelden;

import java.util.Random;

public class StarterHelden {

    static Random random = new Random();

    public static void main(String[] args) {

        //Superheld thor = new Superheld("Thor", 100, "Blitze werfen");
        // Superheld loki = new Superheld("Loki", 100, "Verrat");

        Batman batman = new Batman(5);
        System.out.println(batman.getLebenspunkte());
        Spiderman spiderman = new Spiderman(2);
        System.out.println(spiderman.getLebenspunkte());
        Superman superman = new Superman(8);
        System.out.println(superman.getLebenspunkte());

        spiderman.faedenVerschiessen(random.nextInt(1, 4));
        System.out.println(batman.getLebenspunkte());
        batman.lebenspunkteAuffuellen();
        System.out.println(batman.getLebenspunkte());

        Heldenteam team1 = new Heldenteam("Superteam", spiderman, batman, superman);
        System.out.println(team1.getErstenHeld());
        System.out.println(team1.getZweitenHeld());
        System.out.println(team1.getDrittenHeld());

        team1.nenneTeammitglieder();
        System.out.println(team1.getGesamtLeben());
        // Kampfarena kampfarena = new Kampfarena(thor, loki);
        // kampfarena.heldenKampfStarten();
    }
}
