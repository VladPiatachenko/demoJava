package sumdu.edu.ua.actors;

public class StudentOrientirer extends Student {

    String compas;

    public StudentOrientirer(String name, String sport) {
        super(name);
        this.compas = sport;
    }

    public void checkMap(){
        System.out.println(name+" lost in woods");
    }

    @Override
    public String toString() {
        return "StudentOrientirer{" +
                "compas='" + compas + '\'' +
                ", name='" + name + '\'' +
                ", subs=" + subs +
                ", studId='" + studId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", id=" + id +
                '}';
    }
}
