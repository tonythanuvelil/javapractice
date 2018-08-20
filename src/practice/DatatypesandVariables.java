/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Tony
 */
public class DatatypesandVariables {
    public static void main(String[] args) {
        
        // Range of values is +_(2^(no of bits))/2 --> eg +_2^8= +_128 ie the range is -128 to 127
        
        byte b = 127; // 1 byte = 8 bits
        
        short sh = 32767; // 2 bytes
        
        int i = 2147483647; //4 bytes
        int gg = 2;       
        long sum = i * gg;
        
        long large = 9223372036854775807L; //8 bytes
        
        String name = "Tony";
        
        float val = 1f; //4 bytes
        
        double n = 21.254d; //8 bytes
        double x = val+n;
        
        boolean c = true; //1 bit
        
        char cc = 'Y';
        char bb = 88; // not the number 88 - ASCII code for X
        
        int j= (int) n; // type conversion double to int
        
        int ar[] = new int[5];
        ar[0] = 1; ar[1] = 2; ar[2] = 3; ar[3] = 4; ar[4] = 5;
        int br[] = {10,20,30,40,50,60};
        int ma[][] = new int[5][5]; // multi dimensional array
        int k = 1;
        // Adding values to array  
        for(int p=0; p<5; p++){
            for(int q=0; q<5; q++){
                ma[p][q] = k;
                k++;
            }
        }
        System.out.println("Short "+sh);
        System.out.println("Variables: i="+i+" j="+gg+", Sum is: "+i*gg);
        System.out.println("Long is: "+large);
        System.out.println("String is: "+name);
        System.out.println("Float is: "+val);
        System.out.println("Double is: "+n);
        System.out.println("Decimal operation: "+x);
        System.out.println("Boolean value: "+c);
        System.out.println("Characters: "+bb+" & "+cc);
        System.out.println("Type conversion of double "+n+" to int: "+j);
        System.out.println("Array ar[3]= "+ar[3]);
        System.out.println("Array br[3]= "+br[3]);
        System.out.println("Multi-dimensional array");
        for(int p=0; p<5; p++){
            for(int q=0; q<5; q++){
                if(ma[p][q] <= 9){
                    System.out.print("0"+ma[p][q]+" ");
                }
                else
                System.out.print(ma[p][q]+" ");
            }
            System.out.println();
        }
    }
    
}
