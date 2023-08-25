package lp30formatandother;

import lp13to20oop.examples.Person;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 17);
        System.out.println(person); // не явный вызов toString()

        // Все классы не явно наследуются от Object
//        Empty empty = new Empty();
//        empty.toString();

        // Случайные числа
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
//            int a = random.nextInt(11); // не включительно диапазон
            // Самим (догадаться как) вывести случайное число от 5 до 10 включительно
            int a = random.nextInt(5, 11);
//            int a = random.nextInt(6) + 5; // или так
            System.out.print(a + " ");
        }

        // ДЗ
        // Написать программу эмитирующая бросок кубика, генерация от 1 до 6, ваше число X,
        // при этом для вывода использовать String.format и продемонстрировать в цикле, 100 бросков.
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(1, 7);
            String result = String.format("Ваше число %s", num);
            System.out.println(result);
        }

    }
}
