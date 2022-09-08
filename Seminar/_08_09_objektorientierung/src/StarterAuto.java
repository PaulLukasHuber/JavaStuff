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

public class StarterAuto {

    public static void main(String[] args) {

        System.out.println("Anzahl hergestellter Autos: " + Auto.getAnzahlHergestellterAutos());

        Auto golf = new Auto("Volkswagen",2,0,"grau",111);
        Auto porsche9ff = new Auto("Porsche - 9FF",1,0,"weiß",1400);

        System.out.println("Anzahl hergestellter Autos: " + Auto.getAnzahlHergestellterAutos());

        System.out.println("Die Farbe vom " + porsche9ff.getHersteller() + " ist " + porsche9ff.getFarbe());
        System.out.println("Die Leistung vom " + golf.getHersteller() + " ist " + golf.getLeistung());

        porsche9ff.setFarbe("Anthrazit");
        System.out.println("Die Farbe vom " + porsche9ff.getHersteller() + " ist " + porsche9ff.getFarbe());

        Auto f40 = new Auto("Rot", 700);


    }
}
