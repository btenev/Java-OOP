package P5_Restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    //•	double SALMON_GRAMS = 22
    private static final double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price) {
        super(name, price, Salmon.SALMON_GRAMS);
    }
}
