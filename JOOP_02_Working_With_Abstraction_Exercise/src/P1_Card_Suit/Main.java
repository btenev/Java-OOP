package P1_Card_Suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("Card Suits")) {
            CardTypes[] values = CardTypes.values();
            System.out.println("Card Suits:");
            for (CardTypes value : values) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", value.getNum(), value.name());
            }
        }

    }
}
