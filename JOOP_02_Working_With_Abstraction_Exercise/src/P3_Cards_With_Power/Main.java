package P3_Cards_With_Power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        Rank_Powers rank_powers = Rank_Powers.valueOf(rank);
        Suit_Power suitPower = Suit_Power.valueOf(suit);

        System.out.printf("Card name: %s of %s; Card power: %d",
                rank_powers.name(), suitPower.name(),
                rank_powers.getPower() + suitPower.getSuitPower());
    }
}
