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

package extraProjects;/*
Another simple CC project. The focus here is on the control flow using a switch statement.
 */

public class Continents {

    public static void main(String[] args) {

        int continent = 4;

        switch (continent) {
            case 1 -> System.out.println("North America: Mexico City, Mexico");
            case 2 -> System.out.println("South America: Sao Paulo, Brazil");
            case 3 -> System.out.println("Europe: Berlin, Germany");
            case 4 -> System.out.println("Africa: Lagos, Nigeria");
            case 5 -> System.out.println("Asia: Shanghai, China");
            case 6 -> System.out.println("Australia: Sydney, Australia");
            case 7 -> System.out.println("Antarctica: McMurdo Station, US");
            default -> System.out.println("Undefined continent!");
        }

    }

}