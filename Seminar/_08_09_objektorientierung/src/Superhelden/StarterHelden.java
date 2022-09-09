/*
 * MIT License
 *
 * Copyright (c) 2022 REPLACE_WITH_NAME
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

        Superheld thor = new Superheld("Thor", 100, "Blitze werfen");
        Superheld loki = new Superheld("Loki", 100, "Verrat");

        Batman batman = new Batman(5);
        System.out.println(batman.getLebenspunkte());
        Aquaman aquaman = new Aquaman(6);
        System.out.println(aquaman.getLebenspunkte());
        Superman superman = new Superman(8);
        System.out.println(superman.getLebenspunkte());

        Ironman ironman = new Ironman(2);
        System.out.println(ironman.getLebenspunkte());
        Spiderman spiderman = new Spiderman(2);
        System.out.println(spiderman.getLebenspunkte());

        spiderman.faedenVerschiessen(random.nextInt(1, 4));
        System.out.println(batman.getLebenspunkte());
        batman.lebenspunkteAuffuellen();
        System.out.println(batman.getLebenspunkte());

        Heldenteam team1 = new Heldenteam("DC", aquaman, batman, superman);

        Heldenteam team2 = new Heldenteam("Marvel", ironman, spiderman, thor);

        team1.nenneTeammitglieder();
        System.out.println(team1.getGesamtLeben());

        Kampfarena teamkampf = new Kampfarena(team1, team2);
        teamkampf.teamKampfStarten();


        Kampfarena kampfarena = new Kampfarena(thor, loki);
        System.out.println("Gewonnen hat " + kampfarena.heldenKampfStarten(thor, loki).getName() + " nach " + " Runden.");
    }
}
