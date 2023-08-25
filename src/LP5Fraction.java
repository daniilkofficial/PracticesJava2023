public class LP5Fraction {
    public static void main(String[] args) {
        double radius = 10.8; // автоматически считает в double - 10.8D
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println(area);

        float radius2 = 10.8F;
        float pi2 = 3.14F;
        float area2 = pi2 * radius2 * radius2;
        System.out.println(area2); // точность ниже, вместо 0 стоит 3

        System.out.println();
        // Самостоятельно
        // Почитать средний возраст членов семьи
        int ageAnna = 25;
        int ageMasha = 22;

        int sum = ageAnna + ageMasha;

        double ageAvg = (double) sum / 2;
        System.out.println(ageAvg);
    }
}
