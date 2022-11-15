package P4_Pizza_Calories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                String exception = String.format("Cannot place %s on top of your pizza.", toppingType);
                throw new IllegalArgumentException(exception);
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            String exception = String.format("%s weight should be in the range [1..50].", this.toppingType);
            throw new IllegalArgumentException(exception);
        }
        this.weight = weight;
    }

    public double calculateCalories () {
        ToppingModifiers toppingModifier = ToppingModifiers.valueOf(this.toppingType.toUpperCase());
        return (this.weight * 2) * toppingModifier.getToppingModifier();
    }

}
