package com.github.fleury08.command;

import com.github.fleury08.command.classes.CommandTurnOff;
import com.github.fleury08.command.classes.CommandTurnOn;
import com.github.fleury08.command.classes.LightReceiver;
import com.github.fleury08.command.classes.SwitchInvoker;
import com.github.fleury08.command.interfaces.ICommand;

public class CommandMain {
    public CommandMain() {
        LightReceiver light = new LightReceiver();

        ICommand turnOn = new CommandTurnOn(light);
        ICommand turnOff = new CommandTurnOff(light);

        SwitchInvoker swch = new SwitchInvoker();

        swch.storeAndExecute(turnOn);
        swch.storeAndExecute(turnOff);
        swch.storeAndExecute(turnOn);
        swch.storeAndExecute(turnOff);
        swch.storeAndExecute(turnOff);
        swch.storeAndExecute(turnOn);
    }
}
