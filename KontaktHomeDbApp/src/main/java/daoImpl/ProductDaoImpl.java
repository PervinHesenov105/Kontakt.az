/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoImpl;

import Config.AbstractDao;
import daoInter.ProductDaoInter;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Perfect
 */
public class ProductDaoImpl extends AbstractDao implements ProductDaoInter {

    @Override
    public Product getProductById(int id) {
        Product p = null;
        try ( Connection conn = connect()) {

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM products inner join category using(category_id) where id=" + id);

            while (result.next()) {
                p = getProduct(result);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return p;
    }

    @Override
    public boolean removeProduct(int id) {
      try ( Connection conn = connect()) {
            Statement statement = conn.createStatement();

            return statement.execute("delete from Products WHERE id=" + id);

        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean insertProduct(Product p) {
         try ( Connection conn = connect()) {
            PreparedStatement statement = conn.prepareStatement("insert into products(id,name,price,exsists,category_id) values(?,?,?,?,?)");
            statement.setInt(1, p.getId());
            statement.setString(2, p.getName());
            statement.setInt(3, p.getPrice());
            statement.setString(4, p.getExsists());
            statement.setInt(5, p.getCategory_id());
            
            return statement.execute();

        } catch (Exception ex) {
            return false;
        }
        
    }

    @Override
    public Product getProduct(ResultSet rs) throws Exception {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int price = rs.getInt("price");
        String exists = rs.getString("exsists");
        int catergory_id = rs.getInt("category_id");
        String category = rs.getString("category");
        Category ct = new Category(catergory_id, category);

        return new Product(id, name, price, exists, catergory_id, ct);
    }

    @Override
    public List<Product> getAllProduct() { 
        List<Product> p = new ArrayList();
        try ( Connection conn = connect()) {

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM products inner join category using(category_id) ");

            while (result.next()) {
                p.add(getProduct(result));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return p;}

    @Override
    public boolean updateProduct(Product u) {
     try ( Connection conn = connect()) {
            PreparedStatement statement = conn.prepareStatement("update products set name=?,price=?,exsists=?,category_id=? where id=?");
      
            statement.setString(1, u.getName());
            statement.setInt(2, u.getPrice());
            statement.setString(3, u.getExsists());
             statement.setInt(4, u.getCategory_id());
             statement.setInt(5, u.getId());

            return statement.execute();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());;
            return false;
           
        }
    
    }

}
