package org.example.commandpattern.commands;

import org.example.commandpattern.AirCondition;

public class ACDecreaseTemp implements Command {

    private AirCondition ac;

    public ACDecreaseTemp(AirCondition ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.decreaseTemp();
    }

    @Override
    public void unexecute() {
        ac.increaseTemp();
    }
}
