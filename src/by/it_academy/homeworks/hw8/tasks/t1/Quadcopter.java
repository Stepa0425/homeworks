package by.it_academy.homeworks.hw8.tasks.t1;

public class Quadcopter extends Aircraft {

    public Quadcopter(double liftingCapacity, double flightRange) {
        super(liftingCapacity, flightRange);
    }

    @Override
    public String toString() {
        return "The Quadcopter\nLifting capacity: " + this.getLiftingCapacity() + " persons\nFlight range: " + this.getFlightRange() + " kms\n";
    }
}
