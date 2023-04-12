package by.osinin.homework.lesson7.FirstTask;

public class Circle implements Figure {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        float p = 2*3.14f*radius;
        System.out.println("Perimenter circle: " + p);


    }

    @Override
    public void square() {
        float s = 3.14f*radius*radius;
        System.out.println("Square circle: " + s);


    }

}
