package org.example.maq.parking.models;

import java.time.LocalDateTime;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;


    public Ticket(String ticketId, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public void markExit(){
        this.exitTime=LocalDateTime.now();
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public String getTicketId(){
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
