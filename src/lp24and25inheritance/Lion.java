package lp24and25inheritance;

public class Lion extends CatFamily {

    //    public Lion(){
//        super(); // автоматически будет вызван
//    }

    // Самостоятельно
    public Lion() {
        super(4, 2, true);
    }


    // LP25
    @Override
    public void eat() {
        // самостоятельно правильный вывод
        super.eat();
        System.out.println("antelope");
    }
}
