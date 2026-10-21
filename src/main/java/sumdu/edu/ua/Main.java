package sumdu.edu.ua;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student st1= new Student("Allen");
        st1.setGroupId("ASP-21");
        st1.setStudId("SB12345678");
        st1.subs.add(new Subject(Syllabus.Programming));

        Student st2= new Student(st1);

        System.out.println(st1.toString());
        System.out.println(st2.toString());


        st1.subs.add(new Subject(Syllabus.MPF));

        st2.subs.add(new Subject(Syllabus.valueOf("TSS")));

        System.out.println(st2.toString());
        for (Subject sub:st2.subs) {
            System.out.println(sub.toString());
        }


        System.out.println(st1.toString());
        for (Subject sub:st1.subs) {
            System.out.println(sub.toString());
        }





    }
}

