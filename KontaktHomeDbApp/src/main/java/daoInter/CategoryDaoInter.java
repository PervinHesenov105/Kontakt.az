/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daoInter;

import entity.Category;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Perfect
 */
public interface CategoryDaoInter {
    public List<Category> getAllCategory();
     public Category getCategoryById(int id);
    public Category getCategory(ResultSet result)throws Exception;
    public boolean removeCategory(int id);
    public boolean insertCategory(Category u);
    public boolean updateCategory(Category u);
}
