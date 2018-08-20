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
class A{
    int a;
    
    A(int a){
       this.a = a; 
    }   
}

class B extends A{
    int b;
    
    B(int a, int b){
        super(a); // using super to call constructor of super class
        this.b = b;
    }
      
    public void show(){
        System.out.println("a : "+a+"\n"+"b : "+b);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B obj = new B(10, 5);
        obj.show();
    }
}
