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

import java.util.concurrent.TimeUnit;

public class Kampfarena {

    private static int teamRunden = 1;
    private Heldenteam team1;
    private Heldenteam team2;
    Superheld held1;
    Superheld held2;

    public Kampfarena(Superheld held1, Superheld held2) {
        this.held1 = held1;
        this.held2 = held2;
    }

    public Kampfarena(Heldenteam team1, Heldenteam team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void teamKampfStarten() {

        System.out.println("---***---***---***---***---***---");
        System.out.println("     " + team1.getTeamname() + " vs. " + team2.getTeamname());
        System.out.println("---***---***---***---***---***---");
        System.out.println();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (team1.teamTod() && team2.teamTod()) {


            System.out.println("Teamrunde " + teamRunden + ":");


            Superheld kaempferA = null;
            if (team1.getErstenHeld().getLebenspunkte() > 0) {
                kaempferA = team1.getErstenHeld();
            } else if (team1.getZweitenHeld().getLebenspunkte() > 0) {
                kaempferA = team1.getZweitenHeld();
            } else if (team1.getDrittenHeld().getLebenspunkte() > 0) {
                kaempferA = team1.getDrittenHeld();
            }

            Superheld kaempferB = null;
            if (team2.getErstenHeld().getLebenspunkte() > 0) {
                kaempferB = team2.getErstenHeld();
            } else if (team2.getZweitenHeld().getLebenspunkte() > 0) {
                kaempferB = team2.getZweitenHeld();
            } else if (team2.getDrittenHeld().getLebenspunkte() > 0) {
                kaempferB = team2.getDrittenHeld();
            }

            System.out.println("Kampf zwischen: ");
            assert kaempferA != null;
            assert kaempferB != null;
            System.out.println(kaempferA.getName() + " vs. " + kaempferB.getName());
            System.out.println();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            Superheld gewinner = heldenKampfStarten(kaempferA, kaempferB);
            if (gewinner != null) {
                System.out.println(gewinner.getName() + " hat das Duell gewonnen");
            }
            teamRunden++;

            if (team1.getGesamtLeben() > 0) {
                System.out.println(team1.getTeamname() + " hat als Team gewonnen!");
            } else if (team2.getGesamtLeben() > 0) {
                System.out.println(team2.getTeamname() + " hat als Team gewonnen!");
            }

        }
    }


    public Superheld heldenKampfStarten(Superheld held1, Superheld held2) {
        int runden = 1;
        while (held1.istTot() && held2.istTot()) {

            System.out.println("Runde " + runden + ": ");

            int schaden1 = held2.angreifen();
            held1.schadenNehmen(schaden1);
            int schaden2 = held1.angreifen();
            held2.schadenNehmen(schaden2);

            System.out.println(held1.getName() + " hat " + schaden1 + " Schaden von " + held2.getName() + " erhalten.");
            System.out.println(held1.getName() + " hat nun noch " + held1.getLebenspunkte() + " Lebenspunkte!");
            System.out.println();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(held2.getName() + " hat " + schaden2 + " Schaden von " + held1.getName() + " erhalten.");
            System.out.println(held2.getName() + " hat nun noch " + held2.getLebenspunkte() + " Lebenspunkte!");
            System.out.println();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            runden++;
        }
        if (held1.getLebenspunkte() < held2.getLebenspunkte()) {
            return held2;
        } else return held1;
    }
}
