package org.example.maq.parking.models;

import org.example.maq.parking.vehicletype.VehicleType;

public class Vehicle {
    private final String lincensePlate;
    private final VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType, String lincensePlate) {
        this.vehicleType = vehicleType;
        this.lincensePlate = lincensePlate;
    }

    public String getLincensePlate() {
        return lincensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
