package com.github.fleury08.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void info(){
        System.out.println("I'm singleton!");
    }

}
