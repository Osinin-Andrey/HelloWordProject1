package by.osinin.homework.lesson6.SenondTask;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer(900,"Good");
        Ram ram = new Ram("DDR", 16);
        Hdd hdd = new Hdd("Toshiba", 1000,"Internal");
        Computer comp2 = new Computer(2000,"Sony", ram, hdd);

        System.out.println(comp1);
        System.out.println(comp2);
















    }
}
