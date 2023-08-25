public class LP11ForEach {
    public static void main(String[] args) {
        // Самостоятельно
        String[] names = {"Georgi", "Vedor", "Katya", "Maria", "Dima", "Max"};

        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }
        for (String name : names) { // for-each
            System.out.println(name);
        }

        // ДЗ
        // Создать массив целых чисел размером 100 элементов,
        // проинициализировать элементы (присвоить) от 100 до 200 и вывести.
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 100;
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
