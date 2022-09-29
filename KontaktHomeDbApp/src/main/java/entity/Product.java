/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author user
 */
public class Product {
    private int id;
    private String name;
    private int price;
    private String exsists;
    private int category_id;
    private Category category;

    public Product() {
    }

    public Product(int id, String name, int price, String exsists, int category_id, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.exsists = exsists;
        this.category_id = category_id;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExsists() {
        return exsists;
    }

    public void setExsists(String exsists) {
        this.exsists = exsists;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

  
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", exsists=" + exsists + ", category=" + category + '}';
    }
    
    
    
    
}
