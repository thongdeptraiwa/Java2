/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author macos
 */
public class bai2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for(int i=1;i<11;i++){
            list.add(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(""+list.get(i));
        }
    }
}
