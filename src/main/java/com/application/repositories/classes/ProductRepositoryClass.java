package com.application.repositories.classes;

import com.application.entities.Product;
import com.application.repositories.interfaces.ProductRepositoryInterface;

public class ProductRepositoryClass implements ProductRepositoryInterface {

    @Override
    public Product saveProduct(Product product) { return null; }

    @Override
    public String test() { return "Testing Product Repository"; }

}
