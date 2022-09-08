public class Methoden {

    public static void main(String[] args) {

        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        protokolliere(helloWorld);
        protokolliere("Hello World");

    }

    public static void protokolliere(String message) {
        System.out.println(message);
    }

    public static double dividieren(double a, double b) {
        return a / b;
    }

}
