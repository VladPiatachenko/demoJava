package sumdu.edu.ua;

class Subject{
    int id;
    String name;
    int studScore;

    public void setStudScore(int studScore) {
        this.studScore = studScore;
    }

    public Subject(Syllabus  syllabus) {
        this.id= syllabus.id;
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