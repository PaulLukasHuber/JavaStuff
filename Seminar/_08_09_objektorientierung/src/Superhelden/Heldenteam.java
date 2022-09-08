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

public class Heldenteam {

    private final String teamname;
    private Superheld held1;
    private Superheld held2;
    private Superheld held3;


    public Heldenteam(String teamname, Superheld held1, Superheld held2, Superheld held3) {

        this.teamname = teamname;
        this.held1 = held1;
        this.held2 = held2;
        this.held3 = held3;
    }

    public void nenneTeammitglieder() {
        System.out.println("Das Team " + teamname + " besteht aus " + getErstenHeld().getName() + " und " + getZweitenHeld().getName() + " sowie " + getDrittenHeld().getName() + "!");
    }

    public int getGesamtLeben() {
        return held1.getLebenspunkte() + held2.getLebenspunkte() + held3.getLebenspunkte();
    }

    public Superheld getErstenHeld() {
        return held1;
    }

    public Superheld getZweitenHeld() {
        return held2;
    }

    public Superheld getDrittenHeld() {
        return held3;
    }
}
