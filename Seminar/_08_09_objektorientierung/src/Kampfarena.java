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

public class Kampfarena {

    Superheld held1;
    Superheld held2;

    public Kampfarena(Superheld held1, Superheld held2) {
        this.held1 = held1;
        this.held2 = held2;

    }

    public void heldenKampfStarten() {
        while (!held1.istTot() && !held2.istTot()) {
            held1.schadenNehmen(held2.angreifen());
            held2.schadenNehmen(held1.angreifen());
            System.out.println(held1.getName() + " hat noch " + held1.getLebenspunkte() + " Lebenspunkte");
            System.out.println(held2.getName() + " hat noch " + held2.getLebenspunkte() + " Lebenspunkte");
        }


    }
}
