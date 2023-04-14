package by.osinin.homework.lesson7.FirstTask;



public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5, 6, 3);
        triangle.square();
        triangle.getPerimeter();

        Rectangle rectangle = new Rectangle(20, 56);
        rectangle.square();
        rectangle.getPerimeter();

        Circle circle = new Circle(10);
        circle.square();
        circle.getPerimeter();

        int sum = 0; //для находждения суммы пиреметров

        Figure[] figures = getFigures();
        for (Figure figure : figures) { //перебирает фигуры по очереди
            sum = sum + figure.getPerimeter(); //рассчёт суммы периметра
        } //figure.getPerimeter - считает периметр фигуры
        System.out.println("The sum of perimeter of figures: " + sum);
    }

    //Этот метод создаёт и заполняет массив фигурами
    private static Figure[] getFigures() {
        Figure[] figures = new Figure[5];
        figures[0] = new Rectangle(20, 56);
        figures[1] = new Triangle(4, 5, 6, 3);
        figures[2] = new Circle(10);
        figures[3] = new Rectangle(20, 56);
        figures[4] = new Circle(10);
        return figures; //возвращает заполненный массив в Figure[] figures = getFigures();
    }

}




