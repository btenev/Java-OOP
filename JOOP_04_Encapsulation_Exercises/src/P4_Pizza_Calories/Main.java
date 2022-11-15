package P4_Pizza_Calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaTokens = scanner.nextLine().split(" ");
        String[] doughTokens = scanner.nextLine().split(" ");

        String pizzaName = pizzaTokens[1];
        int numberOfToppings = Integer.parseInt(pizzaTokens[2]);

        String flourType = doughTokens[1];
        String bakingTechnique = doughTokens[2];
        double doughWeight = Double.parseDouble(doughTokens[3]);
        Pizza pizza = null;

        try {
            pizza = new Pizza(pizzaName,numberOfToppings);
            Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
            pizza.setDough(dough);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] toppingTokens = input.split(" ");
            String toppingType = toppingTokens[1];
            double toppingWeight = Double.parseDouble(toppingTokens[2]);
            try {
                Topping topping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(topping);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }


            input = scanner.nextLine();
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
