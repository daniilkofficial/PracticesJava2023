package lp26abstract;

public class Main {

    public static void main(String[] args) {
        // Самостоятельно
        // Создать класс Shape (фигура), добавить поля a и b, и добавить конструктор с инициализацией
        // Добавить, метод периметр фигуры.
        // Создать наследники прямоугольник и треугольник (ещё 3-я сторона), и рассчитать везде свой периметр.

//        System.out.println("Фигура");
//        Shape shape = new Shape(10, 20);
//        System.out.println(shape.getPerimeter()); // нет четкой фигуры
        // Теперь абстрактный класс - нельзя создать объект,
        // при абстрактных методах необходимо переопределение при наследовании и нет реализации (содержимого)
        // После наследовании обычного класса уже не требуется реализация, т.к. присутствует в наследуемом классе.
        // Final - запрещает наследовать класс и/или метод(ы).

        System.out.println("Прямоугольник");
        Rect rect = new Rect(10, 20);
        System.out.println(rect.getPerimeter());

        System.out.println("Треугольник");
        Triangle triangle = new Triangle(10, 10, 10);
        System.out.println(triangle.getPerimeter());


        System.out.println("Цветной прямоугольник");
        ColorRect colorRect = new ColorRect(10, 20);
        System.out.println(colorRect.getPerimeter());

    }

}
