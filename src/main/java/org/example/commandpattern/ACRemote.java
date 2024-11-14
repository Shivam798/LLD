package org.example.commandpattern;

import org.example.commandpattern.commands.Command;

import java.util.Stack;

public class ACRemote {
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void executeCommand(Command command){
        command.execute();
        commandHistory.push(command);
        redoStack.clear();
    }

    public void undo(){
        if(!commandHistory.isEmpty()){
            Command command = commandHistory.pop();
            command.unexecute();
            redoStack.push(command);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo(){
        if(!redoStack.isEmpty()){
            Command command = redoStack.pop();
            command.execute();
            commandHistory.push(command);
        }else {
            System.out.println("Nothing to redo.");
        }
    }
}
