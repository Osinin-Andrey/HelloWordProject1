package by.osinin.homework.lesson6.SenondTask;

public class Hdd {
    public String name;
    public int size;
    public String type;

    public Hdd(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}