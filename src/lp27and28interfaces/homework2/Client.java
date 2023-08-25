package lp27and28interfaces.homework2;

public class Client {

    public void makeOrder(Waiter waiter, String nameDish) {
        waiter.bringOrder(nameDish);
    }
}
