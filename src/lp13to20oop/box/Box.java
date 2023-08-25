package lp13to20oop.box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() { // конструктор по умолчанию (первичный конструктор)
        this(10); // С LP17, вызов конструктора класса
    }

    // правка с LP16Constructor (вторичный конструктор)
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // С LP17OverloadMethod
    public Box(double size) {
        this(size, size, size); // вызов конструктора класса
    }

    // С LP18LinkedObject
    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Правки с LP18
    // самостоятельно поправить на возвращаемый int, а не вывод
    public int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume) {
            return 1;
//            System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume) {
            return -1;
//            System.out.println("Current < Another");
        } else {
            return 0;
//            System.out.println("Current == Another");
        }
    }

    // Самостоятельно
    // Возвращает новый объект Box
    public Box copy() {
        return new Box(this);
    }

    // ДЗ
    public Box increase() {
        int up = 2;
        return new Box(this.length * up, this.width * up, this.height * up);
    }


    // правки со следующего урока (LP14)
    protected double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }

    public void showInfo() {
        System.out.println("Length: " + length + ", width: " + width + ", height: " + height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
