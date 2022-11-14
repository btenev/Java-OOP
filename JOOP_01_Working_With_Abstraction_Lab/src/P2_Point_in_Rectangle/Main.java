package P2_Point_in_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = returnIntegerArray(scanner);
        int n = Integer.parseInt(scanner.nextLine());

        Point bottomLeft = new Point(coordinates[0], coordinates[1]);
        Point topRight = new Point(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        for (int i = 0; i < n; i++) {
            int[] newPoint = returnIntegerArray(scanner);
            Point pointToCompare = new Point(newPoint[0], newPoint[1]);

            boolean contains = rectangle.isInside(pointToCompare);
            System.out.println(contains);
        }
    }
    public static int[] returnIntegerArray (Scanner scanner) {
        return  Arrays.
                stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
