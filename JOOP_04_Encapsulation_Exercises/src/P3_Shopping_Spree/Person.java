package P3_Shopping_Spree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {
            this.money -= product.getCost();
            this.products.add(product);
            System.out.printf("%s bought %s%n", this.name, product.getName());
        } else {
            String format = String.format("%s can't afford %s%n", this.name, product.getName());
            throw  new IllegalArgumentException(format);
        }
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);
    }
}
