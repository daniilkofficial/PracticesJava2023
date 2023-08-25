public class LP7Boolean {
    public static void main(String[] args) {
        // правки в LP3IfElse

        // Самостоятельно
        int time = 7;
        int weather = 23;
        boolean isNight = time > 22 || time < 6;
        boolean isGoodWeather = weather > 18 && weather < 24;

        if (isNight) {
            System.out.println("Спать");
        } else if (isGoodWeather) {
            System.out.println("Гулять!");
        } else {
            System.out.println("Читать книгу!");
        }
    }

}
