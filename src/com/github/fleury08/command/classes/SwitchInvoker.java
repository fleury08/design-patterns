package com.github.fleury08.command.classes;

import com.github.fleury08.command.interfaces.ICommand;

import java.util.ArrayList;

public class SwitchInvoker {
    private final ArrayList<ICommand> commands = new ArrayList<>();

    public void storeAndExecute(ICommand command){
        this.commands.add(command);
        command.execute();
    }
}
