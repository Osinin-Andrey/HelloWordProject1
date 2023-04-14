package by.osinin.classwork.lesson7;

public class LessonMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("a", "b", "c");
        laptop.setHdd("10");
        PC pc = new PC("a", "b");
        pc.setHdd("20");

//        Comp comp = new Comp("a", "b");

        Comp myBestComputer = new Laptop("c", "d", "e");
        System.out.println(myBestComputer);
        if (myBestComputer.getHdd() == "100") {
            System.out.println("ogogg");
        } else {
            System.out.println("fooo");
        }

        Airplane plane = new Airplane();
        plane.fly();
        plane.flyWithSound();
        plane.printMessage();

        Duck duck = new Duck();
        duck.fly();
        duck.flyWithSound();
        duck.printMessage();

        //если нет интерфейсов
//        if (plane instanceof Airplane) {
//            ((Airplane)plane).fly();
//        } else if (plane instanceof Duck) {
//            ((Duck) plane).fly();}

        Object obj = new Airplane();
        Object obj2 = new Duck();

        if (obj instanceof Airplane) {
            ((Airplane) obj).fly();
        } else if (obj instanceof Duck) {
            ((Duck) obj).fly();
        }


//вызов метода массива
        Flyable[] flyingItems = getFlyingItems();
        for (Flyable flyable : flyingItems) {
            flyable.flyWithSound();

        }
    }

    //ctrl + alt + m
    private static Flyable[] getFlyingItems() {
        Flyable[] flyingItems = new Flyable[4]; //объединяем, всё что летает
        flyingItems[0] = new Duck();
        flyingItems[1] = new Airplane();
        flyingItems[2] = new Duck();
        flyingItems[3] = new Airplane();
        return flyingItems;
    }
}
