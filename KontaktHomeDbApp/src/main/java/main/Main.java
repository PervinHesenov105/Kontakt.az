/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import Config.Context;
import daoInter.ProductDaoInter;
import entity.Product;

/**
 *
 * @author Perfect
 */
public class Main {

    public static void main(String[] args) {
        ProductDaoInter pdao = Context.instanceProductDao();
            Product u = pdao.getProductById(1);
            System.out.println(u);
    }
    
       
    }
     

