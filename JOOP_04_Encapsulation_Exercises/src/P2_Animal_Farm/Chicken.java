package P2_Animal_Farm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        if (name.length() < 1 || name.contains(" ")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay() {
        double eggsDaily = 0;
        if (this.age >= 0 && this.age < 6) {
            eggsDaily = 2;
        } else if (this.age >= 6 && this.age < 12) {
            eggsDaily = 1;
        } else {
            eggsDaily = 0.75;
        }
        return eggsDaily;
    }
    public double productPerDay () {
        return this.calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day."
                , this.name, this.age, this.productPerDay());
    }

}
