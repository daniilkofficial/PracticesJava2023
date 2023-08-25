package lp31multithreading;

public class Timer implements Runnable {
    @Override
    public void run() { // выполнение в другом потоке
        for (int i = 0; i < 10_000_000; i++) {
            System.out.println(1);
        }
    }
}
