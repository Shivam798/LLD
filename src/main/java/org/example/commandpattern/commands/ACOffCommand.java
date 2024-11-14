package org.example.commandpattern.commands;

import org.example.commandpattern.AirCondition;

public class ACOffCommand implements Command {

    private AirCondition ac;

    public ACOffCommand(AirCondition ac){
        this.ac=ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void unexecute() {
        ac.turnOnAC();
    }
}
