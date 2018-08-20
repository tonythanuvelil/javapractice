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
class TestClass{
    private int id_1;
    private int id_2;
    private String name;
    private String house;
    private String status;

    public TestClass(int id_1) {
        this.id_1 = id_1;
        System.out.println("Constructor: "+this.id_1);
    }

    public TestClass(int id_2, String name, String house, String status) {
        this.id_2 = id_2;
        this.name = name;
        this.house = house;
        this.status = status;
        String classname= this.getClass().getName();
        System.out.println("Constructor: "+this.id_2);
        System.out.println("Name: "+this.name+" House: "+this.house+" Status: "+this.status+"\nClass name: "+classname);
    }
    
    
    
}

public class ConstructorsIntro {
    public static void main(String[] args) {
        TestClass t1=new TestClass(1); //Constructor overloading
        TestClass t2=new TestClass(2,"Jon Snow","Stark","Alive");
        
    }
}
