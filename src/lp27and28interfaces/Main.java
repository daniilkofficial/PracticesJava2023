package lp27and28interfaces;

import lp27and28interfaces.homework.*;
import lp27and28interfaces.homework2.Client;
import lp27and28interfaces.homework2.Waiter;
import lp27and28interfaces.homework2.WaiterDima;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        animals.add(fish);
        for (Animal animal : animals) { // upcast приведение к родительскому типу
            animal.eat();
        }

        System.out.println();

        // наследник может быть только один, поэтому реализовывается интерфейс
        ArrayList<AbleToRun> runs = new ArrayList<>();
        runs.add(cat);
        runs.add(dog);
        runs.add(bird);
        for (AbleToRun runner : runs) {
            runner.run();
        }
        AbleToFly ableToFly = new Bird();
        ableToFly.fly();

//        AbleToRun ableToRun2 = new Dog();
//        Dog dog3 = (Dog) ableToRun2; // явное приведение

        System.out.println();

        Animal animalToDog = new Dog(); // методы только родительского класса
        animalToDog.eat();
        Dog dog2 = (Dog) animalToDog; // downcast приведение к дочернему типу (вручную), лучше проводить проверку
        dog2.run();
//        ((Dog) animalToDog).run();

        System.out.println();
        // ДЗ
        // Создать интерфейс Worker и один метод work.
        // Создать три класса которые реализуют данный интерфейс:
        // 1) директор
        // 2) программист
        // 3) повар
        // Также добавить интерфейс Driver (водитель) и один метод drive.
        // Наделить вождению программиста и повара.
        // Заставить всех работать и в отдельном цикле вызвать всех кто умеет водить машину


        Director director = new Director();
        Programmer programmer = new Programmer();
        Cook cook = new Cook();
        ArrayList<Worker> workers = new ArrayList<>();
//        workers.add(director);    // LP28 правки, что директор не работает
        workers.add(programmer);
        workers.add(cook);

        for (Worker worker : workers) {
            worker.work();
        }

        System.out.println();

        ArrayList<Driver> drivers = new ArrayList<>();
//        drivers.add(director);
        drivers.add(programmer);
        drivers.add(cook);

        for (Driver driver : drivers) {
            driver.drive();
        }
        System.out.println();

        // LP28 правки, что директор не работает
        Director director1 = new Director();
        director1.force(new Worker() { // анонимный класс (обычно интерфейса)
            @Override
            public void work() {
                System.out.println("Работаю");
            }
        });

        System.out.println();
        // ДЗ.2
        // Создать интерфейс официант с одним методом принести заказ,
        // в качестве параметра принимает название блюда которое нужно принести.
        // Создайте класс клиент, у клиента один метод сделать заказ, в качестве параметра принимает официанта, а во вторых название блюда
        // У официанта вызвать принести заказ и передать то блюдо которое заказал официант.
        // Продемонстрировать работу, 1 раз старым способом отдельная реализация официанта и передать в качестве параметра метод
        // 2 раз с помощью анонимного класса.

        WaiterDima waiterOfMeat = new WaiterDima();
        Client client = new Client();
        client.makeOrder(waiterOfMeat, "курица");
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String nameDish) {
                System.out.println("Официант принес: " + nameDish);
            }
        }, "роллы");


    }
}
