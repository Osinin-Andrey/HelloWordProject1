package by.osinin.classwork.lesson8;

public class Child extends Parent {


    public Child() {
        super(); // должен писать в начале
        System.out.println("this is my child constructor");
        System.out.println(super.value);
        super.toString();

    }

    @Override
    public String getName() {
        System.out.println(super.getName());
        System.out.println(getName());
        return "this is cool child";
    }
}
