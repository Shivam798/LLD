package org.example.maq.parking.utils;

import org.example.maq.parking.models.Ticket;
import org.example.maq.parking.strategy.FeeStrategy;
import org.example.maq.parking.vehicletype.VehicleType;

import java.time.Duration;

public class FeeCalculator {

    private static FeeCalculator feeCalculator;
    private final FeeStrategy feeStrategy;

    private FeeCalculator(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public static FeeCalculator getInstance(FeeStrategy feeStrategy){
        if(feeCalculator==null){
            feeCalculator=new FeeCalculator(feeStrategy);
        }
        return feeCalculator;
    }

    public double calculateFee(Ticket ticket){
        return feeStrategy.calculateFee(ticket);
    }

}
