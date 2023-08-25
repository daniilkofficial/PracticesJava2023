public class LP4IntegerTypes {
    public static void main(String[] args) {
        int speed = 300_000;
        long distance = 365L * 24 * 60 * 60 * speed;
        System.out.println(distance);

        int a = 5;
        // a = a + 1;
        // a += 1;
        a++;
        a--;
        a += 10;
        a -= 6;

        byte b = 127;
        // b = b + 1; // перевод в тип int
        b = (byte) (b + 1); // явное приведение типа
        b++;
        System.out.println(b); // переполнение, будет -127

        // Самостоятельно
        byte x1 = 10;
        int t1 = a; // в процессе, при компиляции будет приведено в int

        int x2 = 1;
        byte t2 = (byte) x2; // требуется явное приведение

    }
}
