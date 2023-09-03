/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;



public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/macos/Desktop/thong/java/java2/dataJava2/file1.txt");
        DataInputStream dis = new DataInputStream(fis);
        int items = dis.readInt();
        for(int i=0;i<=items;i++){
            int n = dis.readInt();
            System.out.print(n+" ");
        }
        System.out.println(dis.readUTF());
        System.out.println(dis.readDouble());
        dis.close();
    }
}
