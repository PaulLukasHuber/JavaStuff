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

import java.util.concurrent.TimeUnit;

public class Kampfarena {

    private static int runden = 1;
    Superheld held1;
    Superheld held2;

    public Kampfarena(Superheld held1, Superheld held2) {
        this.held1 = held1;
        this.held2 = held2;

    }

    public void heldenKampfStarten() {
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
            System.out.println("Gewonnen hat " + held2.getName() + " nach " + runden + " Runden.");
        } else System.out.println("Gewonnen hat " + held1.getName() + " nach " + runden + " Runden.");


    }
}
