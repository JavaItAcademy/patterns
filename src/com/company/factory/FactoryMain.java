package com.company.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product productBook = factory.getProduct("Book");
        productBook.sell();

        Product product = factory.getProduct("Notebook");
        product.sell();
    }
}
