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
public class StaticBlock {
    static int a;
    public StaticBlock(int a) {
        this.a = a;
        System.out.println("Constructor: "+a);
    }
    
    static{
        a = 10;
        System.out.println("Static block: "+a);
    }
    
    public static void main(String[] args) {
       StaticBlock s = new StaticBlock(6);
    }
}
