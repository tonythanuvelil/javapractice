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
 * This example uses UNBOUNDED WILDCARD
 */

public class WildCardUnbounded {
    public static void print(List<?> list){
        System.out.println(list+"\n");
    }
    
    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1, 2, 3);
        List<String> s = Arrays.asList("One", "Two", "Three");
        
        print(i);
        print(s);
    }
}
