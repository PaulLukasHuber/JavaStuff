/*
 * Copyright 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

public class Datatypes {

    public static void main(String[] args) {
        System.out.println("Aufgabe 1");
        int a = 5, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        System.out.println("Aufgabe 2");
        System.out.println((double) a + b);
        System.out.println((double) a - b);
        System.out.println((double) a / b);
        System.out.println((double) a * b);
        System.out.println((double) a % b);

        System.out.println("Aufgabe 4");
        //  a       b       c
        int c = 3, d = 5, e = 7;
        System.out.println((c == 3) && (d - e < c));
        System.out.println((d % c > e - c) || !(c + c < e));
        System.out.println((d >= c) && (e >= d) || (c + d < e));
        System.out.println((d == 1) || !(c == 2));
        System.out.println((c * c - e < c) ^ (d != 5));
    }
}
