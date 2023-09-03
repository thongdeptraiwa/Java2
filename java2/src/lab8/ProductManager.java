/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;
/**
 *
 * @author macos
 */
public class ProductManager {
    public static void main(String[] args) {
        Product p1 = new Product("LAMBORGHINI", 1000.0); 
        Product p2 = new Product("Ferrari", 3000.0);
        
        ProductDAO dao = new ProductDAO(); 
        dao.add(p1);
        dao.add(p2);
        

//        try {
//            dao.store("/Users/macos/Desktop/thong/java/java2/dataJava2/datelab8.txt");
//            System.out.println("thong cong");
//        } catch (IOException ex) {
//            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
//        }
           
        
        try {
            dao.load("/Users/macos/Desktop/thong/java/java2/dataJava2/datelab8.txt");
            System.out.println("thong cong");
        } catch (IOException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        Product p = dao.find("LAMBORGHINI");
        System.out.println(">Name: " + p.name); 
        System.out.println(">Price: " + p.price);
        
    }
}
