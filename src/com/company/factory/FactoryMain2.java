package com.company.factory;

public class FactoryMain2 {
    private static Store store;

    public static void configure(String storeType) {
        if (storeType.equals("BookStore")) {
            store = new BookStore();
        } else if (storeType.equals("ComputerStore")) {
            store = new ComputerStore();
        } else if (storeType.equals("ClothStore")) {
            store = new ClothStore();
        }
    }

    public static void main(String[] args) {
        configure("BookStore");
        store.putInStore();
        configure("ClothStore");
        store.putInStore();
    }
}
