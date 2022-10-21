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

package questions;

public class AndroidOS {
    public AndroidOS() {
        System.out.println("AndroidOS Booting Up...");
    }

    public void runQuizApp() {
        // Create three questions here
        Questions one = new Questions(921238, "How tall is the Eiffel tower? ", "1024 ft", "1063 ft", "1124 ft", "1163 ft", 1);
        Questions two = new Questions(107343, "Who invented the computer algorithm? ", "Charles Babbage", "John Carmack", "Alan Turing", "Ada Lovelace", 3);
        Questions three = new Questions(748294, "What is the name for the patch of skin found on your elbow? ", "Elbow Skin", "Fascia Elbora", "Wenis", "Todd", 2);
        // System.out.println("Question 1: "" + ...)

        System.out.println("Question 1:  " + one.imageId + " Question: " + one.questionText + " Answer: " + one.correctAnswer);
        System.out.println("Question 2:  " + two.imageId + " Question: " + two.questionText + " Answer: " + two.correctAnswer);
        System.out.println("Question 3:  " + three.imageId + " Question: " + three.questionText + " Answer: " + three.correctAnswer);
    }

    public static void main(String[] args) {
        System.out.println("Starting: AndroidOS");
        AndroidOS androidOS = new AndroidOS();
        androidOS.runQuizApp();
    }
}