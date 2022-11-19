package P2_Vehicles_Extension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }


    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    String driving(double distance) {
        double fuelNeeded = this.fuelConsumption * distance;
        DecimalFormat df = new DecimalFormat("#.##");
        if (this.fuelQuantity >= fuelNeeded) {
            this.fuelQuantity -= fuelNeeded;
            return String.format("%s travelled %s km", getClass().getSimpleName(), df.format(distance));
        }
        return String.format("%s needs refueling", getClass().getSimpleName());
    }

    @Override
    public String toString () {
        return String.format("%s: %.2f", getClass().getSimpleName(), this.fuelQuantity);
    }


    void refueling(double refuel) {
        if (refuel <= 0) {
            throw new IllegalStateException("Fuel must be a positive number");
        }

        if (this.fuelQuantity + refuel > this.tankCapacity) {
            throw new IllegalStateException("Cannot fit fuel in tank");
        }

        this.fuelQuantity += refuel;
    }
}
