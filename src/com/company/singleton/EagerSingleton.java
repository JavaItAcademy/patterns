package com.company.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.err.println("In constructor");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
