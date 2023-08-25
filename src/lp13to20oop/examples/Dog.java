package lp13to20oop.examples;

public class Dog {

    public String name;
    public String breed;
    public double weight;

    public int speed;

    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.println("Running!");
        }
    }

    public String getInfo() {
        return "Name: " + name + "\nBreed: " + breed + "\nWeight: " + weight + "\nSpeed: " + speed;
    }
}
