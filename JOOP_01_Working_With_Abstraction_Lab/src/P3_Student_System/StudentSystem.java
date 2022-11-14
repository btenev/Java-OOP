package P3_Student_System;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void ParseCommand(String[] input) {
        String[] args = input;
        String command = args[0];
        String name = args[1];
        switch (command) {
            case "Create":
                int age = Integer.parseInt(args[2]);
                double grade = Double.parseDouble(args[3]);
                if (!repo.containsKey(name)) {
                    Student student = new Student(name, age, grade);
                    repo.put(name, student);
                }
                break;
            case "Show":
                if (repo.containsKey(name)) {
                    Student student = repo.get(name);
                    System.out.println(student.view());
                }
                break;
        }
    }
}
