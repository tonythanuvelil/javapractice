/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.singletonpattern;

/**
 *
 * @author Tony Thanuvelil
 */
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.show();
    }
}
