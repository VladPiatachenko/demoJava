package sumdu.edu.ua.actors;

import sumdu.edu.ua.subject.Subject;

import java.util.ArrayList;

public class Student extends Person {
    int id;
    static int nextId=0;
    String groupId;
    String studId;
    public ArrayList<Subject> subs;

    public Student(String name) {
        super(name);
        this.id = ++nextId;
        subs = new ArrayList<>();
    }

    public Student(Student stud) {
        super(stud.getName());
        this.id = ++nextId;
        this.groupId = stud.groupId;
        this.studId = stud.studId;
        this.subs = new ArrayList<>();
        this.subs.addAll(stud.subs);
    }
    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", groupId='" + groupId + '\'' +
                ", studId='" + studId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
