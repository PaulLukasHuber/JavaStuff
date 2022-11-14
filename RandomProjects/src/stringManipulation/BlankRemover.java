package stringManipulation;

import java.util.Scanner;

/**
 * This program removes all blanks from a string.
 *
 * @author Paul-Lukas Huber 2022
 */

public class BlankRemover {
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();
    String output = input.replaceAll("\\s", "");

    public static void main(String[] args) {
        BlankRemover blankRemover = new BlankRemover();
        System.out.println("Input your text here: ");
        System.out.println("Input: " + blankRemover.input);
        System.out.println(blankRemover.output);
    }
}
