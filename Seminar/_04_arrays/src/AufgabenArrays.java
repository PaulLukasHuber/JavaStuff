public class AufgabenArrays {

    public static void main(String[] args) {

        //Eindimensional
        String[] namen = {"Max Meier", "Gundula Gans", "Heribert Hase", "Johannes Jäger", "Max Muster", "Peter Hauptmann", "Simon Salbei"};
        //Zweidimensional
        String[][] zweidimArray = {{"Zeile 1-1", "Zeile 1-2", "Zeile 1-3", "Zeile 1-4", "Zeile 1-5"}, {"Zeile 2-1", "Zeile 2-2", "Zeile 2-3", "Zeile 2-4", ""}, {"Zeile 3-1", "Zeile 3-1"}};
        //Dreidimensional
        int[][][] dreidimensionalesArray = {{{1, 2, 3, 4, 5}, {6, 7, 8, 9}}, {{11, 12, 13}, {15, 16}}, {{23, 22, 21}, {25}, {26, 27}, {30, 31, 32}}};


        //Aufgabe 1
        System.out.println("Aufgabe 1: ");
        System.out.println();
        printArrayFor(namen);
        printArrayForeach(namen);
        System.out.println();

        //Aufgabe 2
        System.out.println("Aufgabe 2: ");
        search(namen, "Simon Salbei");
        search(namen, "Peter Hauptmnn");
        System.out.println();

        //Aufgabe 3
        System.out.println("Aufgabe 3: ");
        System.out.println("Altes Array");
        printArrayForeach(namen);
        System.out.println();
        nameChanger(namen, "Max Muster", "Thomas Müller");
        System.out.println("Neues Array");
        printArrayFor(namen);

        //Aufgabe 4
        copy(namen);
    }

    //Aufgabe 1
    //For Print
    public static void printArrayFor(String[] array) {
        System.out.println("For Schleife");
        for (String s : array) {
            System.out.println(s);
        }
    }

    //Foreach Print
    public static void printArrayForeach(String[] array) {
        System.out.println("Foreach Schleife");
        for (String name : array
        ) {
            System.out.println(name);
        }
    }


    //Aufgabe 2
    public static void search(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                System.out.println("Der Teilnehmer wurde gefunden! Dieser befindet sich an Position: " + i);
                break;
            } else if (i == array.length - 1) {
                System.out.println("Der Teilnehmer wurde nicht gefunden!");
            }
        }
    }

    //Aufgabe 3
    public static String[] nameChanger(String[] array, String nameAlt, String nameNeu) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(nameAlt)) {
                array[i] = nameNeu;
                return array;
            }
        }
        return array;
    }

    //Aufgabe 4
    public static void copy(String[] array) {
        String[] copy = new String[array.length];
        {
            copy = array.clone();

        }
    }
}


