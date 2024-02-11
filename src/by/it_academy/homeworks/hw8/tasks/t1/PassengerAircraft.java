package by.it_academy.homeworks.hw8.tasks.t1;

public abstract class PassengerAircraft extends Quadcopter {
    private int passengerCapacity;

    public PassengerAircraft(int passengerCapacity, double liftingCapacity, double flightRange) {
        super(liftingCapacity, flightRange);
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isFitPassengerCapacity(int min, int max) {
        return this.getPassengerCapacity() >= min && this.getPassengerCapacity() <= max;
    }

    public boolean isFitLiftingCapacity(double min, double max) {
        return this.getLiftingCapacity() >= min && this.getLiftingCapacity() <= max;
    }

    public boolean isFitFlightRange(double min, double max) {
        return this.getFlightRange() >= min && this.getFlightRange() <= max;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
