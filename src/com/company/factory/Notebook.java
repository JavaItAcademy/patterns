package com.company.factory;

public class Notebook implements Product {
    @Override
    public void sell() {
        System.out.println("selling notebook");
    }

    @Override
    public void buy() {
        System.out.println("buying notebook");
    }

    @Override
    public void unpack() {
        System.out.println("unpacking notebook");
    }

    @Override
    public void log() {
        System.out.println("logging notebook");
    }
}
