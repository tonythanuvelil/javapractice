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

interface Primary{
    public void methOne(int a);
    public void methTwo(int a, int b);
}

class Secondary implements Primary{

    @Override
    public void methOne(int a) {
       System.out.println("methOne\na: "+a);
    }

    @Override
    public void methTwo(int a, int b) {
        System.out.println("methTwo\na: "+a+" b:"+b);
    }
    
}

public class Interfaces {
    public static void main(String[] args) {
        Primary obj;
        obj = new Secondary();
        obj.methOne(6);
        obj.methTwo(7, 9);
    }
}
