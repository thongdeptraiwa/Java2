/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author macos
 */
public class mainB1 {
    public static void main(String[] args) {
        
        MyThread mt = new MyThread();
        
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
    }
}
