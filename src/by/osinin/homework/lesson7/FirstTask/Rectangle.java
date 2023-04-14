package by.osinin.homework.lesson7.FirstTask;

public class Rectangle implements Figure {

    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public int getPerimeter() {
        int p = 2 * (sideA + sideB);
        System.out.println("Perimeter rectangle: " + p);
        return p;
    }

    @Override
    public void square() {
        int s = sideA * sideB;
        System.out.println("Square rectangle: " + s);

    }
}
