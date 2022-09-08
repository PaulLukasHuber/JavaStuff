import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Taschenrechner {

    static Scanner input = new Scanner(System.in).useLocale(Locale.GERMAN);
    static double z1, z2;

    public Taschenrechner() {
    }

    public static void main(String[] args) {

        Taschenrechner myTaschenrechner = new Taschenrechner();

        //Variables
        boolean fortsetzen = true;
        ArrayList<Double> ergebnisse = new ArrayList<>();

        //Liste
        System.out.println("*-*-*-*-*-*-*-*");
        System.out.println("Taschenrechner");
        System.out.println("*-*-*-*-*-*-*-*");

        System.out.println("Operatorenliste: ");
        System.out.println("+ - Addition");
        System.out.println("- - Subtraktion");
        System.out.println("* - Multiplikation");
        System.out.println("/ - Divison");
        System.out.println("% - Modulo");
        System.out.println("^ - Hoch nehmen");
        System.out.println("Sqrt - Wurzel");
        System.out.println("Ausgabe - Ausgabe des Array");
        System.out.println("? - Liste erneut ausgeben");


        while (fortsetzen) {
            System.out.println();
            System.out.println("Gebe die Operation an: ");
            switch (input.next()) {
                case "+":
                    System.out.println("Gebe die erste Zahl ein: ");
                    z1 = input.nextDouble();
                    System.out.println("Gebe die zweite Zahl ein: ");
                    z2 = input.nextDouble();
                    myTaschenrechner.ergebnisVerarbeiten(myTaschenrechner.add(z1, z2), ergebnisse);
                    break;
                case "-":
                    System.out.println("Gebe die erste Zahl ein: ");
                    z1 = input.nextDouble();
                    System.out.println("Gebe die zweite Zahl ein: ");
                    z2 = input.nextDouble();
                    myTaschenrechner.ergebnisVerarbeiten(myTaschenrechner.subtract(z1, z2), ergebnisse);
                    break;
                case "*":
                    System.out.println("Gebe die erste Zahl ein: ");
                    z1 = input.nextDouble();
                    System.out.println("Gebe die zweite Zahl ein: ");
                    z2 = input.nextDouble();
                    myTaschenrechner.ergebnisVerarbeiten(myTaschenrechner.multiply(z1, z2), ergebnisse);
                    break;
                case "/":
                    System.out.println("Gebe die erste Zahl ein: ");
                    z1 = input.nextDouble();
                    System.out.println("Gebe die zweite Zahl ein: ");
                    z2 = input.nextDouble();
                    myTaschenrechner.ergebnisVerarbeiten(myTaschenrechner.divide(z1, z2), ergebnisse);
                    break;
                case "%":
                    System.out.println("Gebe die erste Zahl ein: ");
                    z1 = input.nextDouble();
                    System.out.println("Gebe die zweite Zahl ein: ");
                    z2 = input.nextDouble();
                    myTaschenrechner.ergebnisVerarbeiten(myTaschenrechner.modulo(z1, z2), ergebnisse);
                    break;
                case "^":
                    System.out.println("Gebe die erste Zahl ein: ");
                    z1 = input.nextDouble();
                    System.out.println("Gebe die zweite Zahl ein: ");
                    z2 = input.nextDouble();
                    myTaschenrechner.ergebnisVerarbeiten(myTaschenrechner.xHochY((int) z1, (int) z2), ergebnisse);
                    break;
                case "Sqrt":
                    System.out.println("Gebe die Zahl ein, bei welcher die Wurzel gezogen werden soll: ");
                    z1 = input.nextDouble();
                    myTaschenrechner.ergebnisVerarbeiten(myTaschenrechner.square(z1), ergebnisse);
                    break;
                case "Ausgabe":
                    System.out.println(ergebnisse);
                case "?":
                    System.out.println("Operatorenliste: ");
                    System.out.println("+ - Addition");
                    System.out.println("- - Subtraktion");
                    System.out.println("* - Multiplikation");
                    System.out.println("/ - Divison");
                    System.out.println("% - Modulo");
                    System.out.println("^ - Hoch nehmen");
                    System.out.println("Sqrt - Wurzel");
                    System.out.println("Ausgabe - Ausgabe des Array");
                    System.out.println("? - Liste erneut ausgeben");
                    break;
                default:
                    System.out.println("Eingabe fehlerhaft, bitte erneut eingeben!");
            }

            System.out.println("Soll eine weitere Berechnung ausgeführt werden? J/N");
            if (input.nextLine() == "J") {
                fortsetzen = true;
                System.out.println("Gebe die Operation an: ");
            } else if (input.nextLine() == "N") {
                fortsetzen = false;
            }
        }
    }

    public static ArrayList ergebnisVerarbeiten(double z1, ArrayList list) {
        if (z1 % 1 == 0) {
            int z11 = (int) z1;
            list.add(z11);
            System.out.println(list.get(list.size() - 1));
            return list;
        } else list.add(z1);
        System.out.println(list.get(list.size() - 1));
        return list;
    }

    public static int xHochY(int z1, int z2) {
        int ergebnis = 1;
        if (z1 > 0 && z2 == 0) {
            return ergebnis;
        } else if (z1 == 0 && z2 >= 1) {
            return 0;
        } else {
            for (int i = 0; i < z2; i++) {
                ergebnis = ergebnis * z1;
            }
            return ergebnis;
        }
    }

    public double add(double z1, double z2) {
        return z1 + z2;
    }

    public double subtract(double z1, double z2) {
        return z1 - z2;
    }

    public double multiply(double z1, double z2) {
        return z1 * z2;
    }

    public double divide(double z1, double z2) {
        return z1 / z2;
    }

    public double modulo(double z1, double z2) {
        return z1 % z2;
    }

    public double square(double z1) {
        return Math.sqrt(z1);
    }
}
