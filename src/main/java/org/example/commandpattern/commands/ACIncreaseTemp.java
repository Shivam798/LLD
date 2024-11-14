package org.example.commandpattern.commands;

import org.example.commandpattern.AirCondition;

public class ACIncreaseTemp implements Command {

    private AirCondition ac;

    public ACIncreaseTemp(AirCondition ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.increaseTemp();
    }

    @Override
    public void unexecute() {
        ac.decreaseTemp();
    }
}
