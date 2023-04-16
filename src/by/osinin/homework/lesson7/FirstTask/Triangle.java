package by.osinin.homework.lesson7.FirstTask;

public class Triangle implements Figure {

    int sideA;
    int sideB;
    int sideC;
    int sideCH;


    public Triangle(int sideA, int sideB, int sideC, int sideCH) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideCH = sideCH;
        //построил конструктор через генерейт
    }

    @Override
    public int getPerimeter() {
        int p = sideA + sideB + sideC;
        System.out.println("Periment triangle: " + p);
        return p;
        //для вывода инфы о периметре


    }

    @Override
    public void square() {
        double s = 0.5*sideA*sideCH;
        System.out.println("Square triangle: " + s);

    }
}
