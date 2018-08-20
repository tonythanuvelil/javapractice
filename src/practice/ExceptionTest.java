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
public class ExceptionTest {
    int a = 5;
    int b = 0;
    int r;
    
    void print(){
        try{
            do{
                r = a/b;
                System.out.println("Result "+b+" is "+r);
                b++;
            }while(b<10);
            
        } catch(Exception ex){
            System.out.println("Exception caught");
        }
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("Finished");
    }
    
    public static void main(String []args){
       ExceptionTest t = new ExceptionTest();
       t.print();
    }
}
