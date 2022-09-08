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

public class Superheld {

    private final String name;
    private final String faehigkeit;
    Random random = new Random();
    private int lebenspunkte;

    public Superheld(String name, int lebenspunkte, String faehigkeit) {
        this.name = name;
        this.lebenspunkte = lebenspunkte;
        this.faehigkeit = faehigkeit;
    }

    public boolean istTot() {
        return this.lebenspunkte > 0;

    }

    public int angreifen() {
        if (random.nextInt(1, 16) == 15) {
            System.out.println("Kritischer Treffer durch " + this.name + "!");
            return 15;
        } else if (random.nextInt(1, 51) == 50) {
            System.out.println(this.name + " nutzt seine Fähigkeit " + this.faehigkeit + "!");
            return 30;
        }
        return random.nextInt(1, 11);
    }

    public void schadenNehmen(int schaden) {
        this.lebenspunkte -= schaden;
    }

    //Getter
    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public String getName() {
        return name;
    }

}
