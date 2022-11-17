package P3_Birthday_Celebrations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> livingThings = new ArrayList<>();

        while(!input.equals("End")) {
            String[] tokens = input.split(" ");
            String classType = tokens[0];

            switch (classType) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthDate = tokens[4];

                    Birthable citizen = new Citizen(name, age, id, birthDate);
                    livingThings.add(citizen);
                    break;
                case "Pet":
                    String namePet = tokens[1];
                    String birthDatePet = tokens[2];

                    Birthable pet = new Pet(namePet, birthDatePet);
                    livingThings.add(pet);
                    break;
                case "Robot":
                    String model = tokens[1];
                    String idRobot = tokens[2];
                    Robot robot = new Robot(idRobot,model);
                    break;
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        String[] filtered = livingThings
                .stream()
                .map(Birthable::getBirthDate)
                .filter(s -> s.substring(s.lastIndexOf('/') + 1).equals(year))
                .toArray(String[]::new);

        if (filtered.length > 0) {
            Arrays.stream(filtered).forEach(System.out::println);
        } else {
            System.out.println("<no output>");
        }
    }
}
