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
abstract class First{
    abstract void methOne();
    
    public void methTwo(){
        System.out.println("Not an abstract method");
    }
}

class Second extends First{
    @Override
    void methOne() {
        System.out.println("Implementing abstract method in child class");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        First f = new Second();
        f.methOne();
        f.methTwo();
    }
}
