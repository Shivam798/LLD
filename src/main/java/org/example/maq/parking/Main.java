package org.example.maq.parking;

import org.example.maq.parking.models.ParkingLot;
import org.example.maq.parking.models.Ticket;
import org.example.maq.parking.models.Vehicle;
import org.example.maq.parking.strategy.DefaultFeeStrategy;
import org.example.maq.parking.vehicletype.VehicleType;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("City Centre Parking");
        parkingLot.addLevel(1,30, VehicleType.BIKE);
        parkingLot.addLevel(2,20, VehicleType.CAR);
        parkingLot.addLevel(3,5, VehicleType.TRUCK);

        Vehicle car = new Vehicle(VehicleType.BIKE,"KA-01-AA-1234");
        Ticket ticket = parkingLot.parkVehicle(car);

        DefaultFeeStrategy feeStrategy = new DefaultFeeStrategy();
        double fee = parkingLot.unParkVehicle(ticket.getTicketId(),ticket,feeStrategy);
        System.out.println("Fee Charged: " + fee);
    }
}
