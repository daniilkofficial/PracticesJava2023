package lp29exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a; // при ошибке пропускается последующий код
            int с = Integer.parseInt("fghfg");

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
//        catch (NumberFormatException e) {
//            System.out.println("Нельзя преобразовать в число");
//        }
        catch (Exception e) {
            System.out.println("Поймано исключение " + e);
        }
        System.out.println("Hello");

        // ДЗ
        // Поймать исключение ArrayIndexOutOfBoundsException

        int[] array = new int[1];
        try {
            array[1] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Превышен придел массива");
        }
    }
}
