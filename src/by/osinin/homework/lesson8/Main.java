package by.osinin.homework.lesson8;

public class Main {
    public static void main(String[] args) {
        //Создаю три экземпляра класса Phone.
        Phone apple = new Phone("+375291112233", "Iphone", 100);
        Phone samsung = new Phone("+375297771177", "Galaxy", 150);
        Phone hp = new Phone("+375296660066", "Elite", 200);

        //Вывод на консоль значения переменных.
        System.out.println(apple.getNumber());
        System.out.println(samsung);
        System.out.println(hp);

        //вывод на консоль кто звонит
        apple.receiveCall("mom");
        samsung.receiveCall("dad");
        hp.receiveCall("sister");
        samsung.sendMessage("first", "second", "third");

        //вывод на консоль кто звонит и с какого номера
        apple.receiveCall("mom", "+375331111111");
        samsung.receiveCall("dad", "+375292222222");
        hp.receiveCall("sister", "+375293333333");

        apple.sendMessage("+375291112233", "+375297771177");
        samsung.sendMessage("+375297777777", "+375296666666", "+375333333333", "+375444444444");
        hp.sendMessage("102", "103", "104");


    }
}
