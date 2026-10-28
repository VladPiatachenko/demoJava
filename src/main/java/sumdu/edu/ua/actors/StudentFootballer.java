package sumdu.edu.ua.actors;

public class StudentFootballer extends Student {

    String ball;

    public StudentFootballer(String name, String attribute) {
        super(name);
        this.ball = attribute;
    }

    void runningWorkout(){
        System.out.println(name+" went running laps");
    }

    @Override
    public String toString() {
        return "StudentFootballer{" +
                "ball='" + ball + '\'' +
                ", id=" + id +
                ", groupId='" + groupId + '\'' +
                ", studId='" + studId + '\'' +
                ", subs=" + subs +
                ", name='" + name + '\'' +
                '}';
    }
}
