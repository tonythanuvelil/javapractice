/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamvc;

import java.util.ArrayList;
import java.util.List;
import javamvc.controller.StudentController;
import javamvc.model.Student;
import javamvc.view.StudentView;

/**
 *
 * @author Tony Thanuvelil
 */
public class StudentApp {
    public static void main(String[] args) {
        // Get values from DB
        String[] names = {"John", "Robert"};
        String[] rolls = {"1", "2"};
        
        List<Student> values = new ArrayList<>();
        
        for(int i=0;i<names.length;i++)
            values.add(new Student(rolls[i], names[i]));

        StudentView view = new StudentView();

        StudentController controller = new StudentController(values, view);
        controller.updateView();
   }

}
