package lp27and28interfaces.homework2;

public class WaiterDima implements Waiter {

    @Override
    public void bringOrder(String nameDish) {
        System.out.println("Официант Дима принес: " + nameDish);
    }
}
