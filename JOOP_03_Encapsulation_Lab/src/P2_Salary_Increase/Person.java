package P2_Salary_Increase;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        double increase = this.age < 30
                ? this.salary * (bonus / 200)
                : this.salary * (bonus / 100);
        this.setSalary(increase + salary);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.0##");
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, decimalFormat.format(salary));
    }
}
