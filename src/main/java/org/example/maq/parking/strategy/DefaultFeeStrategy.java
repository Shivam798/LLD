package org.example.maq.parking.strategy;

import org.example.maq.parking.models.Ticket;

import java.time.Duration;

public class DefaultFeeStrategy implements FeeStrategy{
    @Override
    public double calculateFee(Ticket ticket) {
        Duration duration = Duration.between(ticket.getEntryTime(),ticket.getExitTime());
        long hour = Math.max(1,duration.toHours());
        switch (ticket.getVehicle().getVehicleType()) {
            case CAR -> {
                return hour * 10;
            }
            case BIKE -> {
                return hour * 5;
            }
            case TRUCK -> {
                return hour * 20;
            }
            default-> throw new IllegalArgumentException("Unknown vehicle type!");
        }
    }
}
