package lesson12;

import java.util.Objects;

class Person {
    private String name;
    private int number;

    public Person(String name, int number) {
        this.name = name;
        this.number  = number;
    }

    String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return number == person.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
