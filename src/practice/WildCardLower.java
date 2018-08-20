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
 * This example uses LOWER BOUNDED WILDCARD
 */

public class WildCardLower {
    public static void print(List<? super Integer> list){
        System.out.println(list+"\n");
    }
    
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1, 2, 3);
        List<Number> n = Arrays.asList(4, 5, 6);
//        List<Double> d = Arrays.asList(4, 5, 6); This gives error
        print(i);
        print(n);
    }
}
