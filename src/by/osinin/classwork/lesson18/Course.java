package by.osinin.classwork.lesson18;

public class Course {
    protected String name;

    public Course() {
    }

    public String getName() {
        return name;
    }

    public Course(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
