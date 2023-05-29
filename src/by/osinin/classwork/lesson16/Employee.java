package by.osinin.classwork.lesson16;

public class Employee {
    private final String category;
    private final double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "category='" + category + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String category, double salary) {
        this.category = category;
        this.salary = salary;
    }
}
