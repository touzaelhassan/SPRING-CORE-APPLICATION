package com.application.entities;

public class Product {

    private Integer id;
    private String name;
    private String description;
    private Integer price;

    public Product() { }

    public Product(String name, String description, Integer price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setId(Integer id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(Integer price) { this.price = price; }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public Integer getPrice() { return price; }


}
