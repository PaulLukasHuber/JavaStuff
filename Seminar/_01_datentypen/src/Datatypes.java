public class Datatypes {

    public static void main(String[] args) {
        System.out.println("Aufgabe 1");
        int a = 5, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        System.out.println("Aufgabe 2");
        System.out.println((double) a + b);
        System.out.println((double) a - b);
        System.out.println((double) a / b);
        System.out.println((double) a * b);
        System.out.println((double) a % b);

        System.out.println("Aufgabe 4");
        //  a       b       c
        int c = 3, d = 5, e = 7;
        System.out.println((c == 3) && (d - e < c));
        System.out.println((d % c > e - c) || !(c + c < e));
        System.out.println((d >= c) && (e >= d) || (c + d < e));
        System.out.println((d == 1) || !(c == 2));
        System.out.println((c * c - e < c) ^ (d != 5));
    }
}
