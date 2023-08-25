package lp24and25inheritance;

import lp13to20oop.box.Box;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
//        System.out.println(cat.isCanEatPerson());
//        System.out.println(cat.legs);
//        System.out.println(lion.isCanEatPerson());
        // LP25
        cat.eat();
        lion.eat();


        // ДЗ
        // Создать класс весовая коробка наследника Box.
        // Создать в классе те же конструкторы и поле вес.
        // Добавить родительский класс showInfo вывод всю информацию о коробке.
        // А в дочернем переопределить showInfo что бы к выводу был добавлен вес коробки.

        System.out.println();

        Box box1 = new Box();
        box1.showInfo();
        box1.showVolume();


        WeightBox weightBox1 = new WeightBox();
        weightBox1.showInfo();
        weightBox1.showVolume();

        WeightBox weightBox2 = new WeightBox(20,20,20,23);
        weightBox2.showInfo();
        weightBox2.showVolume();
        weightBox2.setDimens(20,22,20,23);
        weightBox2.showInfo();
        weightBox2.showVolume();

        WeightBox weightBox3 = new WeightBox(weightBox2);
        weightBox3.showInfo();
        weightBox3.showVolume();

    }
}
