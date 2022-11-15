package P4_Pizza_Calories;

public enum DoughModifiers {
    WHITE(1.5),
    WHOLEGRAIN(1.0),
    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    double doughModifiers;

    DoughModifiers(double doughModifiers) {
        this.doughModifiers = doughModifiers;
    }

    public double getDoughModifiers() {
        return this.doughModifiers;
    }
}
