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
class ClassDemo {

    public int id;
    private String name;
    int i = 0;
    

    //Constructor
    public ClassDemo(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;

    }

    
    public void showValues() {
        System.out.println("Id: " + id + ", " + "Name: " + name);
    }
    
  
    public void finalize(){
        ++i;
        System.out.println("Objects cleared: "+i);
    }

}

public class ClassIntro {

    public static void main(String[] args) {
        ClassDemo dm = new ClassDemo(1);
        ClassDemo cd = new ClassDemo(2);
        ClassDemo c = new ClassDemo(0);
        c = null;
        
        dm.setName("Jon Snow");
        dm.showValues();
       
        cd.setName("Ned Stark");
        cd.showValues();  
        System.gc();
        dm.showValues();
    }

}