/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Tony Thanuvelil
 * 
 * Example - Objects as parameters
 */

class Temp{
    public int a, b;
    public Temp(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class Testing{
    public void show(Temp t){
      System.out.println(t.getClass().getName()+"\na: "+t.a+" b: "+t.b);  
    }   
}

public class ObjectAsParameter {
    public static void main(String[] args) {
        Testing t = new Testing();
        t.show(new Temp(10, 20));
        t.show(new Temp(50, 60));
    }
}