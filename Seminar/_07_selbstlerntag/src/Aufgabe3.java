public class Aufgabe3 {

    public static void main(String[] args) {
        double zahl1, zahl2, ergebnis;
        String operator;

        zahl1 = 2.3;
        zahl2 = 8.6;
        operator = "-";

        ergebnis = berechneErgebnis(zahl1, zahl2, operator);
        System.out.println(ergebnis);
    }

    public static double berechneErgebnis(double zahl1, double zahl2, String operator) {
        if (operator.equals("+")) {
            return zahl1 + zahl2;
        } else System.out.println("ungültiges Ergebnis");
        return 000;
    }
}
