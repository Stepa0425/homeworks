package by.it_academy.homeworks.hw8.tasks.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airline {
    private PassengerAircraft[] aircraftFleet;

    public Airline(PassengerAircraft[] aircraftFleet) {
        this.aircraftFleet = aircraftFleet;
    }

    public Aircraft[] getAircraftFleet() {
        return aircraftFleet;
    }

    private void setAircraftFleet(PassengerAircraft[] aircraftFleet) {
        this.aircraftFleet = aircraftFleet;
    }

    @Override
    public String toString() {
        return "Airline{" + Arrays.toString(aircraftFleet) +
                '}';
    }

    public double getTotalLiftingCapacity() {
        double totalLoadCapacity = 0;
        for (PassengerAircraft el : aircraftFleet) {
            totalLoadCapacity += el.getLiftingCapacity();
        }
        return totalLoadCapacity;
    }

    public int getTotalPassengerCapacity() {
        int totalPassengerCapacity = 0;
        for (PassengerAircraft el : aircraftFleet) {
            totalPassengerCapacity += el.getPassengerCapacity();
        }
        return totalPassengerCapacity;
    }

    public void printTotalPassengerAndLiftingCapacity() {
        System.out.println("Total lifting capacity: " + getTotalLiftingCapacity() + " tons \nTotal passenger capacity: " + getTotalPassengerCapacity() + " persons\n");
    }

    public void bubbleSort() {
        for (int i = 0; i < this.aircraftFleet.length - 1; i++) {
            for (int j = 0; j < this.aircraftFleet.length - i - 1; j++) {
                if (this.aircraftFleet[j + 1].getFlightRange() < this.aircraftFleet[j].getFlightRange()) {
                    PassengerAircraft swap = this.aircraftFleet[j];
                    this.aircraftFleet[j] = this.aircraftFleet[j + 1];
                    this.aircraftFleet[j + 1] = swap;
                }
            }
        }
    }

    public PassengerAircraft[] getAircrafts(int minPassenger, int maxPassenger, double minLifting, double maxLifting, double minFlightRange, double maxFlightRange) {
        List<PassengerAircraft> resultArray = new ArrayList<>();
        for (PassengerAircraft el : aircraftFleet) {
            if (el.isFitFlightRange(minFlightRange, maxFlightRange) && el.isFitLiftingCapacity(minLifting, maxLifting)
                    && el.isFitPassengerCapacity(minPassenger, maxPassenger)) {
                resultArray.add(el);
            }
        }
        return resultArray.toArray(new PassengerAircraft[resultArray.size()]);
    }

}
