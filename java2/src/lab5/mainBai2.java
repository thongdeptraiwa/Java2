/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macos
 */
public class mainBai2 {
    public static void main(String[] args) {
        List<students> list = new ArrayList<>(); 
        
        list.add(new students("Tuấn", "CNTT", 5)); 
        list.add(new students("Cường", "TKTW", 7.5));
        list.add(new students("Hạnh", "CNTT", 8.5));
        try{
            XFile.writeObject("/Users/macos/Desktop/thong/java/java2/dataJava2/dataStudent.dat", list);     
            List<students> list2 = (List<students>) XFile.readObject("/Users/macos/Desktop/thong/java/java2/dataJava2/dataStudent.dat");
            for(students sv : list){
                System.out.println(">Họ và tên: " + sv.getName());
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        
    }
}
