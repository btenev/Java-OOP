package P5_Border_Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> list = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");

            if (tokens.length == 2) {
                String model = tokens[0];
                String id = tokens[1];

                Identifiable robot = new Robot(model, id);
                list.add(robot);
            } else {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];

                Identifiable citizen = new Citizen(name, age, id);
                list.add(citizen);
            }

            input = scanner.nextLine();
        }

        String lastDigitFakeId = scanner.nextLine();

        for (Identifiable identifiable : list) {
            if (identifiable.getId().endsWith(lastDigitFakeId)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}
