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
public class EvenThread implements Runnable{

    @Override
    public void run() {
       for(int i=1;i<11;i++){
           if(i%2 == 0){
               System.out.print(" "+i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                }
           }
           
       }
    }
    
}
