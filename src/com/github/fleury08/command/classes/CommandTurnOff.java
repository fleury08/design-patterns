package com.github.fleury08.command.classes;

import com.github.fleury08.command.interfaces.ICommand;

public class CommandTurnOff implements ICommand {

    private final LightReceiver lightReceiver;

    public CommandTurnOff(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOff();
    }

    @Override
    public void undo() {
        lightReceiver.turnOn();
    }
}
