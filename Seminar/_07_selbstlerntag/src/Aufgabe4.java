import java.util.Locale;
import java.util.Scanner;

public class Aufgabe4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.GERMAN);
        ;

        double zahl1, zahl2, ergebnis;
        String operator;

        System.out.println("Gebe die erste Zahl ein: ");
        zahl1 = input.nextDouble();
        System.out.println("Gebe nun den Operator ein: ");
        operator = input.next();
        System.out.println("Gebe nun die zweite Zahl ein: ");
        zahl2 = input.nextDouble();


        ergebnis = berechneErgebnis(zahl1, zahl2, operator);
        System.out.print(ergebnis);
    }

    public static double berechneErgebnis(double zahl1, double zahl2, String operator) {
        if (operator.equals("+")) {
            return zahl1 + zahl2;
        } else if (operator.equals("-")) {
            return zahl1 - zahl2;
        } else if (operator.equals("*")) {
            return zahl1 * zahl2;
        } else if (operator.equals("/")) {
            return zahl1 / zahl2;
        }
        System.out.println("Eingabe ungültig!");
        System.out.println("Gebe 0.0 aus: ");
        return 000;
    }
}
