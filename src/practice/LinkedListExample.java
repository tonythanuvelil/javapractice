/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.LinkedList;

/**
 *
 * @author Tony Thanuvelil
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.removeFirst();
        list.add(3);
        System.out.println(list+" size: "+list.size());
    }
}
