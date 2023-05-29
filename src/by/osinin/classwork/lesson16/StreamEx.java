package by.osinin.classwork.lesson16;

import by.osinin.classwork.lesson14.MyBestInterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        //как сделать функциональный интерфейс
        MyBestInterface Str = str ->str.substring (0,2);
        //intStr.test("abc");

        List<Integer> testValue = Arrays.asList(1,2,5,3,2,1);
        Map<Integer, Long> result = testValue.stream()
                .collect(Collectors.groupingBy( //сгрупировать
                        Function.identity(),  //идёт число
                        Collectors.counting()));
        System.out.println(result);


        List<User> users  = Arrays.asList(new User (20, "Nick"),
                new User (30, "Mike"),
                new User(20, "Ada"),
                new User(30, "Violetta"));

        Map<Integer, List<User>> userByAge = users.stream()
                .collect(Collectors.groupingBy(User::getAge));
        System.out.println(userByAge);


        //найти среднюю ЗП по категориям, сгруппировтаь
        var employees = Arrays.asList(new Employee("Worker", 200),
                new Employee("Worker", 250),
                new Employee("Worker", 500),
                new Employee("Worker", 1200),
                new Employee("Manager", 1200),
                new Employee("Manager", 700),
                new Employee("Manager", 200));
        //средняя зп
        var averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.println("Средняя ЗП: " + averageSalary);

        //групировка по категориям
        var employeesByCategory = employees.stream().collect(Collectors.groupingBy(Employee::getCategory));
        System.out.println("Категории: " + employeesByCategory);
        //и вывод средней зп
        var salariesByCategory = employees.stream().collect(Collectors.groupingBy(Employee::getCategory,
                Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Средняя зп по категориям: " + salariesByCategory);

        //самая маленькая зп
        var minSalariesByCategory = employees.stream().collect(Collectors.groupingBy(Employee::getCategory,
                Collectors.minBy(Comparator
                        .comparingDouble(Employee::getSalary))));
        System.out.println("Минимальная зп: " + minSalariesByCategory);

        Map<Employee, String> tests = employees.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        Employee::getCategory));
        System.out.println(tests);



     }
}
