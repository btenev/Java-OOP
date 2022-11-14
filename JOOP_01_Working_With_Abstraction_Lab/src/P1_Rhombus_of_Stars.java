import java.util.Scanner;

public class P1_Rhombus_of_Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printTop(n);
        printMiddle(n);
        printBottom(n);
    }

    private static void printMiddle(int n) {
        repeatAndPrintString(n, "* ");    // middle
        System.out.println();
    }

    private static void printBottom(int n) {
        for (int row = 1; row < n; row++) {   // bottom
            repeatAndPrintString(row, " ");
            repeatAndPrintString(n - row, "* ");
            System.out.println();
        }
    }

    public static void printTop (int n) {
        for (int row = 1; row < n; row++) {   // top
            repeatAndPrintString(n - row, " ");
            repeatAndPrintString(row, "* ");
            System.out.println();
        }
    }

    public static void repeatAndPrintString(int length, String symbol) {
        for (int symbols = 0; symbols < length; symbols++) { // symbols
            System.out.printf("%s", symbol);
        }
    }
}
