package by.osinin.classwork.lesson7;

public class Laptop extends Comp {
    //extends Comp - содержит в себе, все данные в Comp


    public Laptop(String hdd, String ram, String touchpad) {
        super(hdd, ram);
        this.touchpad = touchpad;
        this.username = "Andrey";

        //super - это класс родитель (Comp)
        //this. - это класс дети Laptop
    }

    private String touchpad;

    public String getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public void printDisplay() {
        System.out.println("this is laptop display");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad='" + touchpad + '\'' +
                "} " + super.toString();
    }
}

