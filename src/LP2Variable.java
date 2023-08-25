public class LP2Variable {
    public static void main(String[] args) {
        // У Маши было 5 яблок, а у Димы на 5 больше. Сколько яблок?
        int x = 5;
        int y = x + 5;
        System.out.println(y);

        // У Джона 100$, а у Ника в 5 раза больше. Сколько денег у Ника и Джона вместе?

        int scoreJohn = 100;
        int scoreNick = 5 * scoreJohn;
        int sum = scoreJohn + scoreNick;
//        int sub = scoreJohn - scoreNick;
        System.out.println(sum);

        int a = 10;
        int b = 3;
        int c = a / b; // округляется из-за целочисленного типа
        System.out.println(c);
        c = a % b; // остаток от деления 1
        System.out.println(c);

        // Самостоятельное
        // Даны дни, вывести сколько это лет, месяцев и дней.
        int day = 10_000;
//        int day = 365;
        int year = day / 365;
        System.out.println("Лет: " + year);

//        int month = (day % 365)/30; // 145 также дней
        int month = (day - (year * 365)) / 30;
        System.out.println("Месяцев: " + month);

//        int dayOther = (day % 365) % 30; // также
        int dayOther = day - (year * 365) - (month * 30);
        System.out.println("Дней: " + dayOther);

    }
}
