package org.example.commandpattern;

import org.example.commandpattern.commands.*;

public class Main {

    public static void main(String[] args) {
        AirCondition ac = new AirCondition();
        ACRemote remote = new ACRemote();

        Command onAc = new ACOnCommand(ac);
        Command offAc = new ACOffCommand(ac);
        Command increaseTemp = new ACIncreaseTemp(ac);
        Command descreaseTemp = new ACDecreaseTemp(ac);

        remote.executeCommand(onAc);
        remote.executeCommand(increaseTemp);//25
        remote.executeCommand(increaseTemp);//26
        remote.executeCommand(descreaseTemp);//25

        remote.undo();//26
        remote.undo();//25
        remote.redo();//26
        remote.redo();//25
        remote.redo();// Nothing to redo

        remote.executeCommand(offAc);
        remote.undo();
    }
}
