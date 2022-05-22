/*
Another simple CC project. The focus here is on the control flow using a switch statement.
 */

public class Continents {

    public static void main(String[] args) {

        int continent = 4;

        switch (continent) {
            case 1 -> System.out.println("North America: Mexico City, Mexico");
            case 2 -> System.out.println("South America: Sao Paulo, Brazil");
            case 3 -> System.out.println("Europe: Berlin, Germany");
            case 4 -> System.out.println("Africa: Lagos, Nigeria");
            case 5 -> System.out.println("Asia: Shanghai, China");
            case 6 -> System.out.println("Australia: Sydney, Australia");
            case 7 -> System.out.println("Antarctica: McMurdo Station, US");
            default -> System.out.println("Undefined continent!");
        }

    }

}