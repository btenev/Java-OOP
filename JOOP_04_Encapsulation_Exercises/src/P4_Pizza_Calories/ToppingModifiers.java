package P4_Pizza_Calories;

public enum ToppingModifiers {
    MEAT(1.2),
    VEGGIES(0.8),
    CHEESE(1.1),
    SAUCE(0.9);

    double toppingModifier;

    ToppingModifiers(double toppingModifier) {
        this.toppingModifier = toppingModifier;
    }

    public double getToppingModifier() {
        return toppingModifier;
    }
}
