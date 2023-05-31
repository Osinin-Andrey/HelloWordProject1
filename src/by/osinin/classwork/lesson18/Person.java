package by.osinin.classwork.lesson18;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Person {
    @JsonIgnore //если спрятать и не выводить
    private int age;
    @JsonProperty (value = "nick") //изменить имя на ник
    private String name;
    private List<String> hobbies;
    @JsonIgnore
    private Boolean isRich; //тру или фолс будет, если булен и начинается на is

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", isRich=" + isRich +
                '}';
    }

    public Person() {
    }

    public Person(int age, String name, List<String> hobbies, boolean isRich) {
        this.age = age;
        this.name = name;
        this.hobbies = hobbies;
        this.isRich = isRich;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isRich() {
        return isRich;
    }

    public void setRich(boolean rich) {
        isRich = rich;
    }
}
