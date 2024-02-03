package by.it_academy.homeworks.hw8.tasks.t1;

public abstract class Aircraft {
    private double liftingCapacity;

    private double flightRange;


    public Aircraft(double liftingCapacity, double flightRange) {
        this.liftingCapacity = liftingCapacity;
        this.flightRange = flightRange;
    }

    private void setLiftingCapacity(double loadCapacity) {
        this.liftingCapacity = loadCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public double getFlightRange() {
        return flightRange;
    }

    private void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }
}
