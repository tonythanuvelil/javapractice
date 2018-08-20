/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Tony Thanuvelil
 * 
 * Example that uses Java Generic with objects
 */

class GenericTemp{
    public int a, b;
    
    public GenericTemp(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class GenericTesting<IncomingClass>{
    private final IncomingClass object;
    
    public GenericTesting(IncomingClass object){
       this.object = object; 
    }
    
    public IncomingClass get(){
        return this.object;
    }
}

public class GenericsWithClasses {
    public static void main(String[] args) {
        GenericTesting<GenericTemp> obj = new GenericTesting<>(new GenericTemp(10, 20));
        System.out.println("{a:"+obj.get().a+", b:"+obj.get().b+"}");
    }   
}
