package lp13to20oop.examples;

public class Monster {// ДЗ.6 с LP17
    int countEyes; // кол-во глаз
    int countHands; // кол-во рук
    int countLegs; // кол-во ног

    public Monster() {
        this(2);
    }

    public Monster(int size) {
        this(size, size, size);
    }

    public Monster(int countEyes, int countHands, int countLegs) {
        this.countEyes = countEyes;
        this.countHands = countHands;
        this.countLegs = countLegs;
    }

    public void show() {
        System.out.println("Count eyes: " + countEyes + ", hands: " + countHands + ", legs: " + countLegs + ".");
    }

    public void voice() {
        voice(1);
    }

    public void voice(int count) {
        voice(count, "Grrrrrrrrrrr...");
    }

    public void voice(int count, String word) {
        for (int i = 0; i < count; i++)
            System.out.println(word);
    }
}
