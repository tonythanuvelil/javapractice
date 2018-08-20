/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tony Thanuvelil
 * 
 * This example uses UPPER BOUNDED WILDCARD
 */

public class WildCardUpper {
    public static void print(List<? extends Number> list){
        System.out.println(list+"\n");
    }
    
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1, 2, 3);
        List<Double> s = Arrays.asList(11.0, 22.0, 33.0);
        
        print(i);
        print(s);
    }
}
