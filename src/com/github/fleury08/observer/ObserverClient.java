package com.github.fleury08.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverClient implements Observer {

    private String name;

    public ObserverClient(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("For object "+this.name+" the observed object has changed state to :"+arg);
    }
}
