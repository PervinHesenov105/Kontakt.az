/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Perfect
 */
public class Main {

    public static void main(String[] args) {
try {
            Connection c = connect();
            PreparedStatement st = c.prepareStatement("delete from products where price >?");
            st.setInt(1, 1700);
           
            
           
          int rowsDeleted = st.executeUpdate();
if (rowsDeleted > 0) {
    System.out.println(rowsDeleted + " qeder silindi ");
}

            

        } catch (SQLException ex) {
         ex.printStackTrace();
        }

        
    }

    public static Connection connect() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kontakthome",
                "rauf", "1234");

        return conn;

    }
    
    public static void selectProducts(){
        try {
            Connection c = connect();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from products");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                String exists =rs.getString("exsists");
                
                System.out.println("id= "+id);
                System.out.println("name= "+name);
                System.out.println("price= "+price);
                System.out.println("exists= "+exists);
                System.out.println("--------------------");
            }

        } catch (SQLException ex) {
         ex.printStackTrace();
        }

       
    }
}
