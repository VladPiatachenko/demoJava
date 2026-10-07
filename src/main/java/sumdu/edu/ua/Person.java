package sumdu.edu.ua;

public class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        if(name.length()<3||name.length()>20){throw new IllegalArgumentException("Less then 3 or more then 20 will cause exception");}
        else{
        this.name = name;
    }
    }

    public String getNameLowerCase() {
        return name.toLowerCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
