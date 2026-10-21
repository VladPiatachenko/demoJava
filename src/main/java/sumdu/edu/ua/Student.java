package sumdu.edu.ua;

public class Student extends Person{
    int id;

    public Student(int i) {
        super();
        this.id = i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
