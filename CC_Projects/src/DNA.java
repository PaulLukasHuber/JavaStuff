/*
Another Cc project where the focus was on string operations. The aim was to find out whether a base sequence of the DNA is a protein or not.
 */

public class DNA {

    public static void main(String[] args) {

        //Declaration
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna3;

        //String length
        System.out.println(dna.length());

        //Find Start and End Codon
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        int end = dna.indexOf("TGA");
        System.out.println("End: " + end);

        if (start != -1 && end != -1 && (end - start) % 3 == 0) {
            String protein = dna.substring(start, end + 3);
            System.out.println("This is the Protein: " + protein);
        } else System.out.println("There is no Protein");

    }
}
