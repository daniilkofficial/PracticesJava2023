package lp13to20oop.examples;

public class Person {
    private String name;
    private int age;
    private double weight;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int weight) {
        this(name, age);
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // LP30
    @Override
    public String toString() {
//        return "Name: " + name + ", age: " + age;
        return String.format("Name: %s, age: %s", name, age);
    }
}
