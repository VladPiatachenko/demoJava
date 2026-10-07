package sumdu.edu.ua;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student studs[] = new Student[5];

        for (int i = 0; i < studs.length; i++) {
            studs[i] = new Student(i+1);
        }
        List<Person> list = new ArrayList<Person>();

        for (int i = 0; i < studs.length; i++) {
                if(studs[i].id%2==0) list.add(studs[i]);
        }

        for(Person st:list){
            System.out.println(st.toString());
        }

    }
}

