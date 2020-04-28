package com.company.factory;

public class Book implements Product {

    @Override
    public void sell() {
        System.out.println("selling book");
    }

    @Override
    public void buy() {
        System.out.println("buying book");
    }

    @Override
    public void unpack() {
        System.out.println("unpacking book");
    }

    @Override
    public void log() {
        System.out.println("logging book");
    }
}
