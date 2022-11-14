package P2_Card_Rank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("Card Ranks")) {
            System.out.println("Card Ranks:");
            Card_Rank[] values = Card_Rank.values();
            for (Card_Rank value : values) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(),value.name());
            }
        }
    }
}
