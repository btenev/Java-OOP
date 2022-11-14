package P3_Student_System;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String studentComment() {
        String comment = "";
        if (this.grade >= 5.00) {
            comment += " Excellent student.";
        } else if (this.grade >= 3.50) {
            comment += " Average student.";
        } else {
            comment += " Very nice person.";
        }
        return comment;
    }
    public String view() {
        StringBuilder sb = new StringBuilder(String.format("%s is %s years old.", this.name, this.age));
        sb.append(studentComment());
        return sb.toString();
    }
}
