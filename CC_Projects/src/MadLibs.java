/*
 * Copyright 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

public class MadLibs {
    /*
  Another CC project where it is about rebuilding a MadLibs word game, again completely hardcoded without external input.
  */
    public static void main(String[] args) {

        String name1, name2, adjective1, adjective2, adjective3, verb1, noun1, noun2, noun3, noun4, noun5, noun6, place1;
        int number;

        name1 = "Peter";
        name2 = "Tom";

        adjective1 = "relaxed";
        adjective2 = "productive";
        adjective3 = "furious";

        noun1 = "workers";
        noun2 = "Bananas";
        noun3 = "Sirens";
        noun4 = "Mothers";
        noun5 = "Chicken Wings";
        noun6 = "Snail";

        verb1 = "shout";

        place1 = "Madeira";

        number = 2175;

        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}
