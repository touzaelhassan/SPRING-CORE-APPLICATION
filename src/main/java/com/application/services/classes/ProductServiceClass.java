package com.application.services.classes;

import com.application.entities.Product;
import com.application.repositories.interfaces.ProductRepositoryInterface;
import com.application.services.interfaces.ProductServiceInterface;

public class ProductServiceClass implements ProductServiceInterface {

    private ProductRepositoryInterface productRepositoryClass;

    public ProductServiceClass() { }

    public ProductServiceClass(ProductRepositoryInterface productRepositoryClass) { this.productRepositoryClass = productRepositoryClass; }

    @Override
    public Product saveProduct(Product product) { return null; }

    @Override
    public String test() { return productRepositoryClass.test(); }

}
