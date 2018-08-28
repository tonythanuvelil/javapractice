/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.singletonpattern;

/**
 *
 * @author Tony Thanuvelil
 */
public class Singleton {
    private Singleton(){}
   
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
    
    public void show(){
        System.out.println("Hello world");
    }
}
