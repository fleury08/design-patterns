package com.github.fleury08.observer;

import java.util.Observable;

public class ObservableSource extends Observable {
    public void changeState(String state){
        setChanged();
        notifyObservers(state);
    }
}
