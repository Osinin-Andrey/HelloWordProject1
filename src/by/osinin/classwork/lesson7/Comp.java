package by.osinin.classwork.lesson7;

public abstract class Comp {

    //abstract - нельзя создавать объекты этого класса Comp
    private String hdd;
    private String ram;

    protected String username;
    // это поля можем получуть и компа или его детей

    public Comp(String hdd, String ram) {
        this.hdd = hdd;
        this.ram = ram;
        this.username = "Andrey";
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }



    public abstract void printDisplay();





    @Override
    public String toString() {
        return "Comp{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
