package P4_Food_Shortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> listOfBuyers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Buyer buyer =  tokens.length == 3 ? new Rebel(name, age, tokens[2])
                        :  new Citizen(name, age, tokens[2], tokens[3]);

            listOfBuyers.put(name, buyer);
        }

        String randomName = scanner.nextLine();

        while (!randomName.equals("End")) {
            for (Map.Entry<String, Buyer> buyerEntry : listOfBuyers.entrySet()) {
                if(buyerEntry.getKey().equals(randomName)) {
                    buyerEntry.getValue().buyFood();
                }
            }
            randomName =  scanner.nextLine();
        }

        int sum = listOfBuyers
                .values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();

        System.out.println(sum);
    }
}
