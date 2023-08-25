public class LP10Array {
    public static void main(String[] args) {
        String[] nameOfMonth = new String[12];
//        nameOfMonth = new String[]{"dd"};
        nameOfMonth[0] = "January";
        nameOfMonth[1] = "February";
        nameOfMonth[2] = "March"; // самостоятельное заполнение
        nameOfMonth[3] = "April";
        nameOfMonth[4] = "May";
        nameOfMonth[5] = "June";
        nameOfMonth[6] = "July";
        nameOfMonth[7] = "August";
        nameOfMonth[8] = "September";
        nameOfMonth[9] = "October";
        nameOfMonth[10] = "November";
        nameOfMonth[11] = "December";
        for (int i = 0; i < nameOfMonth.length; i++) {
//      for (String s : nameOfMonth) { // цикл foreach
//            System.out.println(nameOfMonth[i]);
            // Самостоятельно вывести с , и последний элемент с .
            System.out.print(nameOfMonth[i]);
            if (i < nameOfMonth.length - 1)
                System.out.print(", ");
            else
                System.out.println(".");
        }

        int[] numbers = {4, 1, 34, 45, 13, 13};
        // Самостоятельно вывести
        System.out.println("Обычный вывод:");
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
        System.out.println("\nВ обратном порядке вывод:");
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.println(numbers[j]);
        }
    }
}
