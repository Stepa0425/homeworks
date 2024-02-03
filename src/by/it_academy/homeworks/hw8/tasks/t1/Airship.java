package by.it_academy.homeworks.hw8.tasks.t1;

public class Airship extends PassengerAircraft {
    public Airship(int passengerCapacity, double liftingCapacity, double flightRange) {
        super(passengerCapacity, liftingCapacity, flightRange);
    }

    @Override
    public String toString() {
        return "The Airship\nPassenger capacity: " + this.getPassengerCapacity() + " persons\nLoad capacity: "
                + this.getLiftingCapacity() + " tons\nFlight range: " + this.getFlightRange() + " kms\n";
    }
}
