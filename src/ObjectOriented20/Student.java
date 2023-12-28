package ObjectOriented20;

public class Student extends Person {
    private String collegeName;
    private int year;

    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
    }

    //getters setters
    public String getCollegeName() {
        return collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
