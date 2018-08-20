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
public class GenericMethod {
    public static <T> void  methOne(T[] input){      
        for(T element: input)
            System.out.print(element+" ");
        System.out.println("\n");
    }
    
    public static <Q> void methTwo(Q a){
        System.out.println("Normal generic method\na: "+a);
    }
    
    public static void main(String[] args){
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"One", "Two", "Three"};
        Double[] doubleArray = {11.0, 22.0, 33.0};
        
        System.out.println("Generic method using arrays");
        System.out.println("Integer array");
        methOne(intArray);
        System.out.println("String array");
        methOne(stringArray);
        System.out.println("Double array");
        methOne(doubleArray);
        
        methTwo(50);
    }
}
