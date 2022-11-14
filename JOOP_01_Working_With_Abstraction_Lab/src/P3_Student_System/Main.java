package P3_Student_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StudentSystem studentSystem = new StudentSystem();

        while (!input.equals("Exit")) {
            String[] tokens = input.split(" ");

            studentSystem.ParseCommand(tokens);

            input = scanner.nextLine();
        }
    }
}
