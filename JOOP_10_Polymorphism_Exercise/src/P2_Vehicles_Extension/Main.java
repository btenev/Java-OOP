package P2_Vehicles_Extension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split(" ");
        String[] truckInput = scanner.nextLine().split(" ");
        String[] busInput = scanner.nextLine().split(" ");

        Vehicle car = getVehicle(carInput);
        Vehicle truck = getVehicle(truckInput);
        Vehicle bus = getVehicle(busInput);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String vehicle = tokens[1];

           // Vehicle vehicle1 = vehicles.get(vehicle);

            if (command.equals("Drive")) {
                Bus.isEmpty = false;
                double distance = Double.parseDouble(tokens[2]);

//                if (vehicle1 instanceof Bus) {
//                    ((Bus) vehicle1). method setEmpty = true;
//                }

                System.out.println(vehicles.get(vehicle).driving(distance));
            } else if (command.equals("Refuel")) {
                double refuel = Double.parseDouble(tokens[2]);
                try {
                    vehicles.get(vehicle).refueling(refuel);
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            } else if (command.equals("DriveEmpty")) {
                //                if (vehicle1 instanceof Bus) {
//                    ((Bus) vehicle1). method setEmpty = true;
//                }
                Bus.isEmpty = true;
                double distanceEmpty = Double.parseDouble(tokens[2]);
                System.out.println(vehicles.get(vehicle).driving(distanceEmpty));
            }
        }

        vehicles.values().forEach(System.out::println);
    }

    private static Vehicle getVehicle(String[] tokens) {
        String carType = tokens[0];
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double fuelConsumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);

        Vehicle vehicle = null;

        switch (carType) {
            case "Car":
                vehicle = new Car(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "Truck":
                vehicle = new Truck(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(fuelQuantity, fuelConsumption, tankCapacity);
                break;
        }
        return vehicle;
    }


}
