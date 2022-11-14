package P4_Hotel_Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split( " ");
        double pricePerDay = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Season season = Season.valueOf(tokens[2].toUpperCase());
        DiscountType discountType = DiscountType.parseDiscount(tokens[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay,days,season, discountType);

        System.out.printf("%.2f", priceCalculator.calculatePrice());
    }


}
