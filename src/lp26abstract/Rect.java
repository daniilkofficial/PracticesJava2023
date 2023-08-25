package lp26abstract;

public class Rect extends Shape {


    public Rect(int a, int b) {
        super(a, b);
    }

    @Override
    public int getPerimeter() {
        return 2 * (getA() + getB());
    }
}
