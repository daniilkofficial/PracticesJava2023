package lp31multithreading;

import java.util.Random;

public class Main {
    static boolean isFive = false;
    static boolean isWin = false;

    public static void main(String[] args) {

//        Timer timer = new Timer();
//        Thread thread = new Thread(timer);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i == 5) {
                        isFive = true;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
                    }
                }
            }
        });
//        thread.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (isFive) {
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
                    }
                }
            }
        });
//        thread2.start();

//        for (int i = 0; i < 10_000_000; i++) {
//            System.out.println(2);
//        }

        // ДЗ
        // Создать игру Угадай число, при этом угадывать будет как той то поток
        // В методе main сгенерировать случайное число от 0 до 1_000_000_000
        // Создать поток который генерирует случайные числа и проверять.
        // Ещё второй поток с секундами

        int max = 1_000_000_000;
        Random random = new Random();
        int code = random.nextInt(max);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    int num;
                    do {
                        num = random.nextInt(max);
//                        System.out.println(num);
                    }
                    while (num != code);
                    System.out.println("Ура! Вы угадали это: " + code);
                    isWin = true;

                }
            }
        });

        t1.start();
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < max; i++) {
                    System.out.println("Время: " + i + " sec.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (isWin) {
                        break;
                    }
                }
            }
        });
        timer.start();

    }
}
