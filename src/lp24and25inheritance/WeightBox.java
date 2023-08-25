package lp24and25inheritance;

import lp13to20oop.box.Box;

public class WeightBox extends Box {
    private double weight;

    public WeightBox() {
        this(10);
    }

    public WeightBox(double size) {
        this(size, size, size, size);
    }

    public WeightBox(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public WeightBox(WeightBox another) {
        this(another.getLength(), another.getWidth(), another.getHeight(), another.getWeight());
    }

    public void setDimens(double length, double width, double height, double weight) {
        super.setDimens(length, width, height);
        this.weight = weight;
    }

    @Override
    public int compare(Box another) {
        return super.compare(another);
    }

    @Override
    public Box increase() {
        return super.increase();
    }

    @Override
    public void showVolume() {
//        super.showVolume(); // разницы нет
        System.out.println(getVolume());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(", weight: " + getWeight());

    }

    public double getVolume() {
        return super.getVolume() * getWeight();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
