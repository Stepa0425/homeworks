package by.it_academy.homeworks.hw8.tasks.t1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(205, 22, 1200);
        System.out.println(airplane);

        Helicopter helicopter = new Helicopter(8, 3, 520.5);
        System.out.println(helicopter);

        Airship airship = new Airship(20, 6, 100);
        System.out.println(airship);

        PassengerAircraft[] aircraft = new PassengerAircraft[]{airship, airplane, helicopter};
        Airline airline = new Airline(aircraft);

        airline.printTotalPassengerAndLiftingCapacity();
        airline.bubbleSort();
        System.out.println(airline);

        PassengerAircraft[] findCrafts = airline.getAircrafts(10, 150, 6, 20, 100, 1200);
        System.out.println(Arrays.toString(findCrafts));
    }
}
