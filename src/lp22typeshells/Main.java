package lp22typeshells;

import lp13to20oop.examples.Dog;
import lp13to20oop.examples.Person;

public class Main {
    public static void main(String[] args) {
//        int a = 5;
//        Integer a1 = 5;
        // сначала создается примитивный, а затем из примитивного объект создается в ссылочном - авто-упаковка
//        byte b;
//        Byte b1;
//        short c;
//        Short c1;
//        long d;
//        Long d1;
//        char e;
//        Character e2;
//        float g;
//        Float g1;
//        double h;
//        Double h1;
//        boolean i;
//        Boolean i1;

        String s = "1000";
        String s1 = "2000";
        System.out.println(s + s1);
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s1);
        System.out.println(a + b);

        String s2 = "This is John. He is 27 years old.";
        String name = s2.substring(8, 12); // вырезается не включительно последний

        // ДЗ получить имя типа String и возраст типа int, и создать класс Person
        int age = Integer.parseInt(s2.substring(20, 22));
        Person person = new Person(name, age);

        System.out.println(person.getName() + " - " + person.getAge());

    }
}
