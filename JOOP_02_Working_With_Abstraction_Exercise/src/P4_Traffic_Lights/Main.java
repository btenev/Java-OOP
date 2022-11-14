package P4_Traffic_Lights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Colors[] colors = Arrays.stream(scanner.nextLine().split(" "))
                .map(Colors::valueOf)
                .toArray(Colors[]::new);
        int n = Integer.parseInt(scanner.nextLine());
        List<Traffic_Lights> trafficLights = new ArrayList<>();

        for (Colors color : colors) {
            Traffic_Lights trafficLight = new Traffic_Lights(color);
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < n; i++) {
            for (Traffic_Lights trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColors() + " ");
            }
            System.out.println();
        }

    }
}
