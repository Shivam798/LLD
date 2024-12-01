package org.example.maq.parking.strategy;

import org.example.maq.parking.models.Ticket;

public interface FeeStrategy {
    double calculateFee(Ticket ticket);
}
