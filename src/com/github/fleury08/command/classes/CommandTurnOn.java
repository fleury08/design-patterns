package com.github.fleury08.command.classes;

import com.github.fleury08.command.interfaces.ICommand;

public class CommandTurnOn implements ICommand {

    private final LightReceiver lightReceiver;

    public CommandTurnOn(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOn();
    }

    @Override
    public void undo() {
        lightReceiver.turnOff();
    }
}
