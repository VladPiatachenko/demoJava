package sumdu.edu.ua.subject;

import sumdu.edu.ua.enums.Syllabus;

public class Subject{
    int id;
    String name;
    int studScore;

    public void setStudScore(int studScore) {
        this.studScore = studScore;
    }

    public Subject(Syllabus syllabus) {
        this.id= syllabus.getId();
        this.name = syllabus.toString();
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studScore=" + studScore +
                '}';
    }
}