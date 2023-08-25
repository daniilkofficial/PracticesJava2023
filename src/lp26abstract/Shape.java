package lp26abstract;

public abstract class Shape {

    private int a;
    private int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int getPerimeter();

    public final int getA() {
        return a;
    }

    public final void setA(int a) {
        this.a = a;
    }

    public final int getB() {
        return b;
    }

    public final void setB(int b) {
        this.b = b;
    }
}
