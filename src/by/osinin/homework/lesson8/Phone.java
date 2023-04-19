package by.osinin.homework.lesson8;

public class Phone {
    private String number;
    private String model;
    private int weight;

    //конструктор с 3 параментрами
    public Phone(String number, String model, int weight) {
        this(number, model); //вызвал из конструктора с тремя параметрами конструктор с двумя.
//        this.number = number; - это можно удалить, для экономии места кода
//        this.model = model;
        this.weight = weight;
    }


    //конструктор с 2 параментрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //конструктор без параметров
    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    //добавил метод receiveCall, с одним параметром name. С выводом на консоль звонит+имя.
    void receiveCall(String name) {
        System.out.println("Сalling: " + name);
    }

    //Добавляю перегруженный метод receiveCall, который принимает два
    //параметра - имя звонящего и номер телефона звонящего.
    void receiveCall(String name, String number) {
        System.out.println("Name: " + name + " " + "number: " + number);
    }

    //Создал метод sendMessage с аргументами переменной длины. Данный
    //метод принимает на вход номера телефонов, которым будет отправлено
    //сообщение
    void sendMessage (String... phoneNumbers){
        System.out.println("Send message for numbers: ");
        for (String num : phoneNumbers) {
            System.out.println(num);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
        //используется для вывода на консоль значения переменных
    }
}
