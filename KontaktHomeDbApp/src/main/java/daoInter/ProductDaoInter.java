/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daoInter;

import entity.Product;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Perfect
 */
public interface ProductDaoInter {
    public List<Product> getAllProduct();
     public Product getProductById(int id);
    public Product getProduct(ResultSet result)throws Exception;
    public boolean removeProduct(int id);
    public boolean insertProduct(Product u);
    public boolean updateProduct(Product u);
}
