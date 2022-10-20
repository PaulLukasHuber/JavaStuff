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

package src;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;


public class LottoLeon {


    public static void main(String[] args) {

        try {


            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("*******************");

            System.out.println("***  Lotto  ***");

            System.out.println("*******************");


            int[] zufallsZahlen = new int[6];

            int[] getippteZahlen = new int[6];


            int g = 0;


            for (int i = 0; i <= 5; i++) {

                g++;

                System.out.println("Bitte geben Sie die " + g + ". Zahl ein");

                getippteZahlen[i] = Integer.parseInt(input.readLine());

            }

            System.out.println("Sie haben folgende Zahlen getippt");

            for (int i = 0; i <= 5; i++) {

                System.out.println(getippteZahlen[i]);

            }

            System.out.println();


            for (int i = 0; i <= 5; i++) {

                // Zufallsgenerator Anlegen

                Random mygenerator = new Random();


                zufallsZahlen[i] = mygenerator.nextInt(50);

            }


            System.out.println("Die Gewinnzahlen Lauten:");


            for (int i = 0; i <= 5; i++) {

                System.out.println(zufallsZahlen[i]);

            }


            System.out.println("Sie haben mit folgenden Zahlen gewonnen:");

            for (int i = 0; i <= 5; i++) {

                for (int j = 0; j <= 5; j++) {

                    if (zufallsZahlen[i] == getippteZahlen[j])

                        System.out.println(getippteZahlen[j]);

                }

            }


        } catch (Exception ex) {

            System.out.println("Irgendwas ist schief gelaufen !!!");


            System.out.println(ex.getMessage());


        }


    }


}
