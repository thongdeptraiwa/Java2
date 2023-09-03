/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author macos
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/macos/Desktop/thong/java/java2/dataJava2/file1.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        final int n =5;
        dos.writeInt(n);
        for(int i=0;i<=n;i++){
            dos.writeInt(i);
        }
        dos.writeUTF("hello!");
        dos.writeDouble(100.75);
        dos.flush();
        dos.close();
    }
}
