package lp13to20oop.examples;

public class Worker {
    String name;
    String post;
    int salary;

    public Worker(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Name: " + name + "\nPost: " + post + "\nMoney: " + salary +" rub.");
    }
}
