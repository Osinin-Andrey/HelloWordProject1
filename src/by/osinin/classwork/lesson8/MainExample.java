package by.osinin.classwork.lesson8;

public class MainExample {
    public static void main(String[] args) {
        Parent Parent = new Child();
        final int myInt = 5; // final - значит значение менять нельзя

        Parent.setName("Tom");
        System.out.println(Parent.getName());
        BadParent superBadParent = new BadParent();
        Personable personable = new BadParent(); //только разрешает пользоваться 2мя методами

        // /** - писать на методом когда надо оставить комментарии




    }


}
