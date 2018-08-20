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
public class VarArgs {
    static void vaTest(int ...v){
        for(int x : v)
            System.out.print(x+" ");
        System.out.println("");
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {1, 2};
        vaTest(a);
        vaTest(b);
    }
}
