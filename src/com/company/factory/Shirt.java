package com.company.factory;

public class Shirt implements Product {
    @Override
    public void sell() {
        System.out.println("selling shirt");
    }

    @Override
    public void buy() {
        System.out.println("buying shirt");
    }

    @Override
    public void unpack() {
        System.out.println("unpacking shirt");
    }

    @Override
    public void log() {
        System.out.println("logging shirt");
    }
}
