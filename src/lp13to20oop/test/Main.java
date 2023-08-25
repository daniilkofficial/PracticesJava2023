package lp13to20oop.test;

import lp13to20oop.box.Box;
import lp13to20oop.examples.*;

public class Main {
    public static void main(String[] args) {
        // класс - шаблон строения, объект - реализация класса
        Box box1 = new Box(); // ссылочный тип, правка с LP16 - создан конструктор
//        box1.length = 10;
//        box1.width = 10;
//        box1.height = 10;
//        box1.setDimens(10, 10, 10); // правка с LP15

        Box box2 = new Box(20, 20, 20); // правка с LP16
//        box1.setDimens(20, 20, 20); // правка с LP15
        Box box3 = box2; // ссылается на box2, при правках box3 будет изменен объект box2
        box3.setWidth(0);

        // правки со следующего урока - создание метода в Box (LP14)
//        double volume = box1.height * box1.length * box1.width;
//        System.out.println(box1.getVolume());
        box1.showVolume();

//        double volume2 = box2.height * box2.length * box2.width;
//        System.out.println(box2.getVolume());
        box2.showVolume();

        // ДЗ.1
        // Создать класс человек у которого есть поля: имя, возраст и вес.
        // Создать три экземпляра человека, присвоить все значения полям
        // и вывести в консоль средний возраст всех людей
        // с LP19 небольшие правки:
        // модификаторы доступа (private) для полей и создан конструктор,
        // а также геттеры и сеттеры
        Person person1 = new Person("Dima", 22, 78);

        Person person2 = new Person("Maria", 19, 56);

        Person person3 = new Person("Victor", 32, 93);

        double sum = person1.getAge() + person2.getAge() + person3.getAge();
        double ageAvg = sum / 3;
        System.out.println("Средний возраст людей: " + ageAvg);
        System.out.println();

        // ДЗ.2 (от следующего урока - LP14 Method)
        // Создать класс собака (Dog) с полями: имя, порода и вес.
        // Метод возвращает строку об собаке.
        // Создать экземпляр класса Dog и вызвать метод информации о собаке.


        // ДЗ.3 добавить поле int скорость и метод run (бежать),
        // внутри метода вывести "бегу" столько сколько указали в поле скорость.
        Dog dog = new Dog();
        dog.name = "Hera";
        dog.breed = "Sharpey";
        dog.weight = 20.8;
        dog.speed = 8;
        System.out.println(dog.getInfo());
        dog.run();

        System.out.println();

        // Следующий урок LP15
        Test test = new Test();
        System.out.println(test.square(20));

        System.out.println();

        // ДЗ.4 с LP15
        // Создать, класс прямоугольник и два поля: длина и ширина.
        // И создайте два метода:
        // 1) параметризированный - устанавливает длину и ширину в прямоугольник
        // 2) без параметров возвращает площадь прямоугольника
        Rectangle rectangle = new Rectangle();
        rectangle.setDimens(10, 10);
        System.out.println(rectangle.getSquare());
        System.out.println();


        // ДЗ.5 с LP16
        // Создайте, класс работник и поля имя, должность, и зарплата,
        // создайте конструктор в котором все эти поля будут проанализированы.
        // Добавить метод showInfo, который выводит всю информацию о конструкторе в консоль.
        Worker worker = new Worker("Georgi", "Cleaner", 22_000);
        worker.showInfo();

        System.out.println();

        // С LP17
//        Math math = new Math();
        System.out.println(MyMath.multiple(10, 5));
        System.out.println(MyMath.multiple(10.8, 5.2));
        System.out.println(MyMath.multiple(5));

        System.out.println(Math.sqrt(36));

        Box box = new Box(30);
        box.showVolume();

        // ДЗ.6 с LP17
        // Создайте, класс Monster и 3 поля: кол-во глаз, кол-во рук и кол-во ног.
        // И создать 3 конструктора:
        // первый без параметров - устанавливает всем 2,
        // второй один параметр количество - всем полям,
        // третий три параметра и установит всем параметрам.
        // Добавить метод voice (голос), перегруженный тремя:
        // 1) с обычной озвучкой и вывод "Grrrrrrrrrrr...";
        // 2) с количеством озвучки и несколькими выводами
        // 3) с кол-вом, словом озвучки и несколько выводами

        Monster monster1 = new Monster();
        monster1.show();
        monster1.voice();

        Monster monster2 = new Monster(5);
        monster2.show();
        monster2.voice(5);

        Monster monster3 = new Monster(3, 4, 3);
        monster3.show();
        monster3.voice(5, "Aaaaaaaa...");


        // С LP18
        Box current = new Box(10);
        Box another = new Box(current);
        Box box5 = current.copy();
//        another.setDimens(20, 20, 20); // меняется только для another
        box5.showVolume();
//        box5.setDimens(10, 10, 10);
        current.showVolume();
        another.showVolume();
        int number = current.compare(another);
        switch (number) {
            case 1 -> System.out.println("Current > Another");
            case -1 -> System.out.println("Current < Another");
            case 0 -> System.out.println("Current == Another");
            default -> System.out.println("not correct");
        }

        /*
         ДЗ.7
         Создайте метод increase (увеличить),
         возвращает коробку все размеры в 2 раза больше той,
         у которой было вызвано.
        */
        Box boxCur = current.increase();
        System.out.println("Current box: ");
        current.showVolume();
        System.out.println("New box with increase: ");
        boxCur.showVolume();

        // С LP19
        System.out.println();
        Person person = new Person("John", 25);
        person.setAge(40); // сеттер с проверкой
        // Все поля должны быть приватными, а доступ через методы геттеры и сеттеры.
        System.out.println("Name: " + person.getName() + ", age: " + person.getAge());

        // Созданы пакеты box, examples и test
        // Модификатор public - доступен в любом месте программы.
        // Модификатор private - доступен во внутри программ, для доступа создаются get и set.
        // Модификатор default (package private) - не доступен в другом пакете.

        // ДЗ.8
        // Доработать класс Box таким образом, что бы везде использовались правильные модификаторы доступа

        // С LP20
        System.out.println();
        System.out.println(MyMath.length(10));
        System.out.println(MyMath.area(10));
        System.out.println(MyMath.length(10));
        System.out.println(MyMath.sum(1, 2, 4, 5, 234));

    }

}
