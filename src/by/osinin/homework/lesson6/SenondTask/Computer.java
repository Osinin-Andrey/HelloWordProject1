package by.osinin.homework.lesson6.SenondTask;

//. Создал класс для описания компьютера, в этом классе
//поля: стоимость, модель(строковый тип), RAM и HDD.
public class Computer {
    private int price;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, Ram ram, Hdd hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}


//Классы для RAM и HDD должны иметь конструктор по умолчанию и
//конструктор со всеми параметрами.
//Класс RAM имеет поля "название" и "объем".



//Класс HDD имеет поля "название", "объем" и "тип" (внешний или
//внутренний).

