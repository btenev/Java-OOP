package P2_Vehicles_Extension;

public class Truck extends Vehicle {
    private static final double ADDITIONAL_FUEL_CONSUMPTION = 1.6;
    private static final double REFUELING_CAP = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + ADDITIONAL_FUEL_CONSUMPTION);
    }

    @Override
    String driving(double distance) {
        return super.driving(distance);
    }

    @Override
    void refueling(double refuel) {
        super.refueling(refuel * REFUELING_CAP);
    }
}
