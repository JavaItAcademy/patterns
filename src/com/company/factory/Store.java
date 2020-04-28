package com.company.factory;

public abstract class Store {
    public void putInStore (){
        Product product = createProduct();
        product.unpack();
        product.sell();
        product.log();
    }

    public abstract Product createProduct();
}
