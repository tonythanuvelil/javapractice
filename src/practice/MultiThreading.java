/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Tony Thanuvelil
 */
class Test extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try{                
                System.out.println(Thread.currentThread().getName()+" --> "+i);               
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }           
        }  
    }
}

public class MultiThreading  {  
    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test();
        a.start();     
        b.start();
    }
}
