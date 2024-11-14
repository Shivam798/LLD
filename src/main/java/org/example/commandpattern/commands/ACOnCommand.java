package org.example.commandpattern.commands;

import org.example.commandpattern.AirCondition;

public class ACOnCommand implements Command {

    private AirCondition ac;

    public ACOnCommand(AirCondition ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void unexecute() {
        ac.turnOffAC();
    }
}
