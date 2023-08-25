package lp13to20oop.examples;

public class MyMath { // с LP17

    // Правки с LP20
    public static final double PI = 3.14; // константа

    public static int sum(int... numbers) { // переменная длины, varargs
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double length(double radius) {
        // из статичных методов обязательно объявлены должны статичными
        return 2 * PI * radius;
    }

    public static double area(double radius) {
//        pi = 10; // при изменении статического класса изменяется для всех вызовов, на уровне класса
        return PI * radius * radius;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }

    public static double multiple(int a) {
        return a * a;
    }


}
