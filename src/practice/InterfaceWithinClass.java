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

class NiceClass{
    public interface One{
        public void print();
        
        // static and default methods can have body in interface and not neccersily overridden in implementing class
        static void show(){
            System.out.println("Static method inside interface");
        }
        
        default void display(){ // You can have multiple default methods in an interface
            System.out.println("Default method inside interface");
        }
    }    
}

class NiceImplementer implements NiceClass.One{

    @Override
    public void print() {
        System.out.println("Hello world!");
    }
       
}

public class InterfaceWithinClass {
    public static void main(String[] args) {
        NiceImplementer n = new NiceImplementer();
        n.print();
        n.display();
        NiceClass.One.show();
    }
}
