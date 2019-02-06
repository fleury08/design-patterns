package com.github.fleury08.observer;

public class ObserverMain {
    public ObserverMain() {
        ObservableSource source = new ObservableSource();
        ObserverClient client1 = new ObserverClient("client1");
        ObserverClient client2 = new ObserverClient("client2");

        source.changeState("PRE OBSERVERS");

        source.addObserver(client1);
        source.addObserver(client2);

        source.changeState("POST OBSERVERS");
    }
}
