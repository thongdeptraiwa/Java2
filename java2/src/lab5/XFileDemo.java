/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class XFileDemo {
    public static void main(String[] args) {
        
        try {
            byte[] data = XFile.read("/Users/macos/Desktop/thong/java/java2/dataJava2/file1.txt");
            XFile.write("/Users/macos/Desktop/thong/java/java2/dataJava2/file2.txt", data);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
