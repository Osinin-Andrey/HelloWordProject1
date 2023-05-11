package by.osinin.classwork.lesson13;

public class Person implements Comparable <Person> { //тут я хочу что бы сравнивал
    private String firstName;
    private String secondName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) { // как он сравниваниет два объекта
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!firstName.equals(person.firstName)) return false;
        return secondName.equals(person.secondName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        return result;
    }

    @Override
    public int compareTo(Person o) {
        if (this.firstName.compareTo(o.firstName) == 0) {
            return this.secondName.compareTo(o.secondName);
        }
        return this.firstName.compareTo(o.secondName);
    }
}