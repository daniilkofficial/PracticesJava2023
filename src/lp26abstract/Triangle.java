package lp26abstract;

public class Triangle extends Shape {

    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return getA() + getB() + getC();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}


