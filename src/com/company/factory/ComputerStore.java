package com.company.factory;

public class ComputerStore extends Store {
    @Override
    public Product createProduct() {
        return new Notebook();
    }
}
