/*
Another small CC project. This one is about performing a mathematical magic trick.
 */

public class Magic {

    public static void main(String[] args) {
        //Original Number - change this Number to see the Trick
        int myNumber = 4;

        //Magic
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;

        //Print
        System.out.println(magicNumber);
    }

}
