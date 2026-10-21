package sumdu.edu.ua;

public enum Syllabus {
    JavaOOP(1),MPF(2),Programming(3),IIT(4), TSS(5), DataScience(6);

    private final int id;

    public int getId() {
        return id;
    }

    Syllabus(int i){
        this.id=i;
    }

    String toString(int i) {
        switch (i){
            case 1: return "Java OOP";
            case 2: return "MPF";
            case 3: return "Programming";
            case 4: return "IIT";
            case 5: return "TSS";
            case 6: return "DataScience";
        }
        return "";
    }

}
