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
 * This example shows ENUMs and their iteration
 */

enum Numbers{
    ONE, TWO, THREE;
}

public class EnumExample {
    public static void main(String[] args) {
        Numbers[] values = Numbers.values();
        for(Numbers value : values){
            System.out.println(value);
        }          
    }
}
