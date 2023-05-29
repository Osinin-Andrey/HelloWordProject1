package by.osinin.classwork.lesson8;

public class Parent {
    protected String value = "33";

    public Parent(){
        System.out.println("this is my default constructor");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
