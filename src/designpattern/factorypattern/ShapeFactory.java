/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.factorypattern;

/**
 *
 * @author Tony Thanuvelil
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
           return null;
        }		
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
           return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
           return new Square();
        }     
        return null;
   }
}