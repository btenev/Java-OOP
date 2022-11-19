package P2_Vehicles_Extension;

public class Car extends Vehicle {
    private static final double ADDITIONAL_FUEL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }


    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + ADDITIONAL_FUEL_CONSUMPTION);
    }

    @Override
    String driving(double distance) {
        return super.driving(distance) ;
    }

}
