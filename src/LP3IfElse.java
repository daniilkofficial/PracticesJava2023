public class LP3IfElse { // ConditionalOperator
    public static void main(String[] args) {
        int temp = 30;

        boolean hot = temp >= 25; // правки LP7Boolean (==, !=, >=, <=, <, >, && и ||)
        boolean cold = temp <= 22;

        int time = 23;
        boolean isNight = time > 22 || time < 6;

        if (hot && !isNight) {
            System.out.println("Кондиционер включен");
        } else if (cold && !isNight) {
            System.out.println("Кондиционер выключен");
        } else {
            System.out.println("Кондиционер ничего не делает");
        }

        // Самостоятельное
        int money = 11;
        if (money > 10) {
            System.out.println("Пицца");
        } else if (money > 6) {
            System.out.println("Гамбургер");
        } else {
            System.out.println("Сэндвич");
        }

    }
}
