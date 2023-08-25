package lp27and28interfaces.homework;

public class Programmer implements Worker, Driver{

    @Override
    public void work() {
        System.out.println("Программист работает");
    }

    @Override
    public void drive() {
        System.out.println("Программист водит машину");
    }
}
