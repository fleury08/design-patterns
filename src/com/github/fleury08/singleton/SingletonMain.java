package com.github.fleury08.singleton;

public class SingletonMain {
    public SingletonMain(){
        Singleton singleton = Singleton.getInstance();
        singleton.info();
    }
}
