/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamvc.controller;
import java.util.List;
import javamvc.model.Student;
import javamvc.view.StudentView;
/**
 *
 * @author Tony Thanuvelil
 */
public class StudentController {
   private List<Student> list;
   private Student model;
   private StudentView view;

   public StudentController(List<Student> list, StudentView view){
       this.list = list;
       this.view = view;
   }

   public void updateView(){
       for(Student object: list){
           model = object;
           view.printStudentDetails(model.getName(), model.getRollNo());
       }       
   }
}
