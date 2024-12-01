package org.example.maq.parking.models;

import org.example.maq.parking.vehicletype.VehicleType;

public class ParkingSlot {
    private int slotId;
    private VehicleType slotType;
    private Vehicle parkedVehicle;

    public ParkingSlot(int slotId, VehicleType slotType) {
        this.slotId = slotId;
        this.slotType = slotType;
    }

    public boolean isAvailable(){
        return parkedVehicle==null;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        return isAvailable() && slotType==vehicle.getVehicleType() ;
    }

    public void parkVehicle(Vehicle vehicle){
        if(!isAvailable()) throw new IllegalStateException("Slot is already occupied!");
        this.parkedVehicle=vehicle;

    }
}
