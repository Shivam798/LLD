package org.example.maq.parking.utils;

import org.example.maq.parking.models.Vehicle;

public class ParkingEventNotifier {
    public void notifyParkEvent(Vehicle vehicle){
        System.out.println("Vehicle with license plate " + vehicle.getLincensePlate() + " has been parked.");
    }

    public void notifyUnparkEvent(Vehicle vehicle){
        System.out.println("Vehicle with license plate " + vehicle.getLincensePlate() + " has been unparked.");
    }
}
