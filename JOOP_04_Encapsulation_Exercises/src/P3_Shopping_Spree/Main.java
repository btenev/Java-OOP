package P3_Shopping_Spree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokensPeople = readInput(scanner);

        Map<String, Person> peopleShopping = new LinkedHashMap<>();
        createShoppingParticipants(tokensPeople, peopleShopping);

        String[] tokensProducts = readInput(scanner);

        Map<String, Product> shoppingProducts = new LinkedHashMap<>();
        createShoppingProducts(tokensProducts, shoppingProducts);

        String commands = scanner.nextLine();

        while (!commands.equals("END")) {
            String[] commandParts = commands.split(" ");
            String name = commandParts[0];
            String product = commandParts[1];

            if (peopleShopping.containsKey(name)) {
                Person shopper = peopleShopping.get(name);

                Product currentProduct = shoppingProducts.get(product);

                shopper.buyProduct(currentProduct);
            }
            commands = scanner.nextLine();
        }
        
        for (Person value : peopleShopping.values()) {
            System.out.println(value.getName() + " - ");
            if (value.getProducts().size() > 0) {
                System.out.println(value.
                        getProducts().
                        stream()
                        .map(Product::getName)
                        .collect(Collectors.joining(", ")));
            } else {
                System.out.println("Nothing bought");
            }
        }
    }

    public static String[] readInput(Scanner scanner) {
        return scanner.nextLine().split(";");
    }

    private static void createShoppingParticipants(String[] tokens, Map<String, Person> peopleShopping) {

        for (String token : tokens) {

            String name = token.split("=")[0];
            double availableMoney = Double.parseDouble(token.split("=")[1]);

            try {
                Person person = new Person(name, availableMoney);
                peopleShopping.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
    }

    private static void createShoppingProducts(String[] tokens, Map<String, Product> shoppingProducts) {

        for (String token : tokens) {

            String name = token.split("=")[0];
            double cost = Double.parseDouble(token.split("=")[1]);

            try {
                Product product = new Product(name, cost);
                shoppingProducts.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }

        }

    }
}