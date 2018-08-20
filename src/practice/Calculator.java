/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Tony Thanuvelil
 */
public class Calculator {
    
    public Calculator(int a, int b, int choice){
        switch(choice){
            case 1:
                add(a, b);
                break;
            case 2:
                subtract(a, b);
                break;
            case 3:
                multiply(a, b);
                break;
            case 4:
                divide(a, b);
                break;
            default:
                System.out.println("No such operation");
                break;
        }
    }
    
    public void add(int a, int b){ 
        int sum = a+b;
        
        System.out.println("Sum is :"+sum);
    }
    
    public void subtract(int a, int b){
        int diff = a-b;
        System.out.println("Difference is :"+diff);
    }
    
    public void divide(int a, int b){
        int quo=0;
        try{
            quo = a/b;
        } catch(Exception e){
            System.out.println("Cannot divide by zero");
        }
        
        System.out.println("Quotient is :"+quo);
    }
    
    public void multiply(int a, int b){
        int pro = a*b;
        System.out.println("Product is : "+pro);
    }        
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Choose an operation\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        String choice = br.readLine();
        System.out.println("Enter value 1");
        String a = br.readLine();
        System.out.println("Enter value 2");
        String b = br.readLine();
        
        Calculator cal = new Calculator(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(choice));
    }
}
