package P1_Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    String driving(double distance) {
        double fuelNeeded = this.fuelConsumption * distance;
        DecimalFormat df = new DecimalFormat("#.##");
        if (this.fuelQuantity >= fuelNeeded) {
            setFuelQuantity(this.fuelQuantity - fuelNeeded);
            return String.format("%s travelled %s km", getClass().getSimpleName(), df.format(distance));
        }
        return String.format("%s needs refueling", getClass().getSimpleName());
    }

    @Override
    public String toString () {
        return String.format("%s: %.2f", getClass().getSimpleName(), this.fuelQuantity);
    }


    void refueling(double refuel) {
        this.fuelQuantity += refuel;
    }
}
