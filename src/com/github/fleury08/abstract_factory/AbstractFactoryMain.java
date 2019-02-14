package com.github.fleury08.abstract_factory;

import com.github.fleury08.abstract_factory.interfaces.DesktopEnvironment;
import com.github.fleury08.abstract_factory.interfaces.Window;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class AbstractFactoryMain {
    public AbstractFactoryMain(){
        List<String> list = new ArrayList<String>();
        list.add("osx");
        list.add("linux");
        list.add("win");
        list.add("bsd");

        String os = list.get(new Random().nextInt(3));

        DesktopEnvironment de = WindowAbstractFactory.createWindow(os);
        Window window = de.createWindow();
        window.show();
    }
}
