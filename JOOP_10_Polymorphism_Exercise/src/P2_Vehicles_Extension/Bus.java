package P2_Vehicles_Extension;

public class Bus extends Vehicle{
    private static final double ADDITIONAL_FUEL_CONSUMPTION = 1.4;
    protected static boolean isEmpty = false;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }


    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        if (!isEmpty) {
            super.setFuelConsumption(fuelConsumption + ADDITIONAL_FUEL_CONSUMPTION);
        }
    }
}
