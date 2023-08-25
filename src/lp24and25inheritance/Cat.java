package lp24and25inheritance;

public class Cat extends CatFamily {
    //    public Cat() {
////        super(); // вызван не явно будет
//        canEatPerson = false;
//    }
    public Cat() {
        super(4, 2, false);
        setLegs(5);
        legs = 5; // модификатор protected
    }

    // LP25
    @Override
    public void eat() {
        super.eat();
        System.out.println("whiskas");
    }
}
