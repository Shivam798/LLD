package org.example.maq.parking.models;

import org.example.maq.parking.vehicletype.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
    private final int levelNumber;
    private final List<ParkingSlot> slots;

    public ParkingLevel(int levelNumber, int numSlots, VehicleType slotType){
        this.levelNumber=levelNumber;
        this.slots=new ArrayList<>();
        for(int i=0;i<numSlots;i++){
            slots.add(new ParkingSlot(i,slotType));
        }
    }

    public ParkingSlot findAvailableSlot(Vehicle vehicle){
        for(ParkingSlot slot:slots){
            if(slot.canFitVehicle(vehicle)){
                return slot;
            }
        }
        return null;
    }
}
