package sumdu.edu.ua;

import sumdu.edu.ua.actors.Student;
import sumdu.edu.ua.actors.StudentFootballer;
import sumdu.edu.ua.actors.StudentOrientirer;
import sumdu.edu.ua.enums.Syllabus;
import sumdu.edu.ua.subject.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ArrayList<Student> list = new ArrayList<Student>();

       list.add(new Student("Harry Potter"));
       list.add(new StudentFootballer("Ted Lasso","egg-shaped ball"));
       list.add(new StudentOrientirer("Jack Sparrow","magic compass"));

       for(Student student : list){
           System.out.println(student.toString());
       }
    }
}

