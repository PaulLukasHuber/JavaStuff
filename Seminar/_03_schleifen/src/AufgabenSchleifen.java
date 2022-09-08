public class AufgabenSchleifen {

    public static void main(String[] args) {

        System.out.println("Aufgabe 1:");
        System.out.println(addierenFor(9));

        System.out.println();
        System.out.println("Aufgabe 2:");
        geteilt1024();

    }

    public static int addierenFor(int n) {

        int i, l = 0;
        for (i = 0; i <= n; i++) {
            l = l + i;
        }
        return l;
    }


    public static void geteilt1024() {
        int n = 1024;
        int i = 1;
        while (n != 1) {
            n = n / 2;
            System.out.println(i);
            i++;
            System.out.println(n);
        }
    }
}

