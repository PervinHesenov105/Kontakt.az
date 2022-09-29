/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import daoImpl.ProductDaoImpl;

/**
 *
 * @author Perfect
 */
public class Context {
    public static ProductDaoImpl instanceProductDao(){
        return new ProductDaoImpl();
    } 
}
