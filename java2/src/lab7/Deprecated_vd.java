/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author macos
 */
public class Deprecated_vd {  
    @Deprecated
    public static boolean isCardNumber(String number){
        int n = Integer.parseInt(number);
        int tong = 0;
        
        while(n>0){
            int a = n % 10;
            tong+=a;
            n = n / 10;
        }
        return tong%2 == 0;
    }
}
