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

package Automobil;

public class Auto {

    private String hersteller;
    private int hoehe;
    private double geschwindigkeit;
    private String farbe;
    private int leistung;

    private static int anzahlHergestellterAutos = 0;

    public Auto(String hersteller, int hoehe, double geschwindigkeit, String farbe, int leistung) {
        this.hersteller = hersteller;
        this.hoehe = hoehe;
        this.geschwindigkeit = geschwindigkeit;
        this.farbe = farbe;
        this.leistung = leistung;
        anzahlHergestellterAutos += 1;
    }

    public Auto(String farbe, int leistung) {
        this.hersteller = "Ferrari - F40";
        this.hoehe = 0;
        this.geschwindigkeit = 0;
        this.farbe = farbe;
        this.leistung = leistung;
        anzahlHergestellterAutos += 1;
    }


    public void beschleunigen(double beschleunigung) {
        geschwindigkeit = geschwindigkeit + beschleunigung;
    }

    public void printFahrzeugbrieg() {
        System.out.println("Hersteller: " + getHersteller());
        System.out.println("H\u00f6he: " + getHoehe());
        System.out.println("Farbe: " + getFarbe());
        System.out.println("Geschwindigkeit: " + getGeschwindigkeit());
        System.out.println("Leistung: " + getLeistung());
    }

    //Getter Setter
    public static int getAnzahlHergestellterAutos() {
        return anzahlHergestellterAutos;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }
}
