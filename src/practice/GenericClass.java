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

class Starter<T>{
    private T t;
    
    public void add(T t){
        this.t = t;
    }
    
    public T get(){
        return t;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Starter<Integer> i = new Starter<>();
        Starter<String> s = new Starter<>();
        
        i.add(10);
        System.out.println("Integer: "+i.get());
        s.add("Hello, world!");
        System.out.println("String: "+s.get());
    }
}
