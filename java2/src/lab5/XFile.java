/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XFile {
    public static byte[] read(String path) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream(path);
        int n = fis.available();
        byte[] data = new byte[n];
        fis.read(data);
        fis.close();
        return data; 
    }
    public static void write(String path, byte[] data) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(path);
        fos.write(data);
        fos.close();
    }
    public static Object readObject(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object object = ois.readObject();
            ois.close();
            return object; 

    }
    
    public static void writeObject(String path, Object object) throws FileNotFoundException, IOException{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            oos.close(); 
    }
}
