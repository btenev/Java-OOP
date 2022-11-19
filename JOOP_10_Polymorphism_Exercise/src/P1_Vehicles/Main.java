package P1_Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split(" ");
        String[] truckInput = scanner.nextLine().split(" ");

        Vehicle car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]));

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String vehicle = tokens[1];

            if (command.equals("Drive")) {
                double distance = Double.parseDouble(tokens[2]);
                System.out.println(vehicles.get(vehicle).driving(distance));
            } else if (command.equals("Refuel")) {
                double refuel = Double.parseDouble(tokens[2]);
                vehicles.get(vehicle).refueling(refuel);
            }
        }

        vehicles.values().forEach(System.out::println);
    }
}
