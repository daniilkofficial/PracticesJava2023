package lp13to20oop.examples;

public class Rectangle {
    double length;
    double width;

    public void setDimens(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getSquare() {
        return length * width;
    }
}
