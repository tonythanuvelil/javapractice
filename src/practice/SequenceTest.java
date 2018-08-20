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
public class SequenceTest {
    public static void main(String[] args) {
        int a = 0, b = 2, n = 10;
        int sum = 0, temp = 0;
        int res;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                res = (int)Math.pow(2, j);
                temp = a+(res * b);
                sum += temp;   
            }
            System.out.print(sum+" ");
            sum = 0;
        }
    } 
}
