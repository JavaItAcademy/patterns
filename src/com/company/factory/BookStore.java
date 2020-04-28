package com.company.factory;

public class BookStore extends Store {
    @Override
    public Product createProduct() {
        return new Book();
    }
}
