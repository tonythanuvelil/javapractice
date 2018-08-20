/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Tony
 */
class SomeClass{
    private final String className = this.getClass().getName();
    
    public void meth(){
        System.out.println("From first meth(): "+className);
        
    }
    
    public void meth(int one, int two){
        System.out.println("From second meth():");
        System.out.println("One: "+one+", Two: "+two);
    }
    
}
public class CompiletimePolymorphism {
    public static void main(String[] args) {
        SomeClass so=new SomeClass();
        so.meth();
        so.meth(1, 2); //method overloading,  static binding
    }
}
