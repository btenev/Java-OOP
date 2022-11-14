package P4_Hotel_Reservation;

public enum DiscountType {
    VIP(0.20),
    SECOND_VISIT(0.10),
    NONE(0.0);

    double discountPercentage;

    DiscountType(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public static DiscountType parseDiscount(String discount) {
        switch (discount) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown discount" + discount);
        }
    }
}
