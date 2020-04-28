package com.company.factory;

public class ClothStore extends Store {
    @Override
    public void putInStore() {
        Product product = createProduct();
        product.sell();
    }

    @Override
    public Product createProduct() {
        return new Shirt();
    }
}
