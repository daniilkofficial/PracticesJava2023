public class LP12SwitchCase {
    public static void main(String[] args) {
        // Самостоятельно
        // Написать программу, которая принимает номер месяца и выводит в консоль его название
//        String[] namesOfMonth = {"January", "February", "March",
//                "April", "May", "June",
//                "July", "August", "September",
//                "October", "November", "December"};
//        System.out.println(nameOfMonth[numMonth - 1]);

        // Пример из урока (с корректировкой в переменную)
//        switch (numMonth){
//            case 1:
//                System.out.println("January");
//                break;
//        }

        int numMonth = 2;
        String nameMonth = switch (numMonth) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Unknown month";
        };
        System.out.println(nameMonth);


        // ДЗ
        // На вход принимается название месяца и выводит в консоль к какому сезону относиться месяц
        String nameOfMonth = "July";
        switch (nameOfMonth) {
            case "January", "February", "December":
                System.out.println("Winter");
                break;
            case "March", "April", "May":
                System.out.println("Spring");
                break;
            case "June", "July", "August":
                System.out.println("Summer");
                break;
            case "September", "October", "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown month");
                break;
        }

    }
}
