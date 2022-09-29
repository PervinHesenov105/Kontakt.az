/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Perfect
 */
public abstract class AbstractDao {
 public static Connection connect() throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/kontakthome";
        String username = "rauf";
        String password = "1234";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}
