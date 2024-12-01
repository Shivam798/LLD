package org.example.maq.parking.models;

import org.example.maq.parking.strategy.FeeStrategy;
import org.example.maq.parking.utils.FeeCalculator;
import org.example.maq.parking.utils.ParkingEventNotifier;
import org.example.maq.parking.vehicletype.VehicleType;

import java.util.*;

public class ParkingLot {
    private final String name;
    private final List<ParkingLevel> levels = new ArrayList<>();
    private final ParkingEventNotifier eventNotifier = new ParkingEventNotifier();

    public ParkingLot(String name) {
        this.name = name;
    }

    public void addLevel(int levelNumber, int numSlots, VehicleType slotType){
        levels.add(new ParkingLevel(levelNumber,numSlots,slotType));
    }

    public Ticket parkVehicle(Vehicle vehicle){
        for(ParkingLevel level:levels){
            ParkingSlot availableSlot = level.findAvailableSlot(vehicle);
            if(availableSlot!=null){
                availableSlot.parkVehicle(vehicle);
                eventNotifier.notifyParkEvent(vehicle);
                return new Ticket(UUID.randomUUID().toString(),vehicle);
            }
        }
        throw new IllegalStateException("No slots available!");
    }

    // ticketId is kept for future use, such as logging or additional validation
    public double unParkVehicle(String ticketId, Ticket ticket, FeeStrategy feeStrategy) {
        FeeCalculator calculator = FeeCalculator.getInstance(feeStrategy);
        ticket.markExit();
        double fee = calculator.calculateFee(ticket);
        eventNotifier.notifyUnparkEvent(ticket.getVehicle());
        return fee;
    }

}
