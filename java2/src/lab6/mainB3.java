/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macos
 */
public class mainB3 {
    public static void main(String[] args) {
        OddThread ot = new OddThread();
        EvenThread et =new EvenThread();
        
        Thread t1 = new Thread(ot);
        Thread t2 = new Thread(et);
        
        t1.start();
        try {
            t1.join();//chạy hết luồng t1 mới đến câu lênh khác
        } catch (InterruptedException ex) {
        }
        t2.start();
    }
}
