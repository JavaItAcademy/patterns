package com.company.factory;

public class Factory {
    public Product getProduct(String productType) {
        if (productType.equals("Book")) {
            return new Book();
        } else if (productType.equals("Shirt")){
            return new Shirt();
        } else if (productType.equals("Notebook")){
            return new Notebook();
        }
        throw new RuntimeException("No such product");
    }
}
