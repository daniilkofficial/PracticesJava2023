public class LP9Loop {
    public static void main(String[] args) {
        // Циклы
        // 1) While
        // 2) Do-While
        // 3) For
        // 4) For-Each

        // 1) While
        int i = 1;
        while (i <= 1000) {
            if (i % 2 == 0) // самостоятельно
                System.out.println(i);
            i++;
            if (i == 5)
                break;
//            i += 2; // ещё проще
        }

//        while (true){}// бесконечный цикл

        System.out.println();

        // 2) Do-While
        int a = 0;
        do {
            System.out.println("Hello!");
        } while (a > 0);

        System.out.println();

        // 3) For
        for (int n = 1; i <= 1000; i++) {
            System.out.println(i);
        }

        // Самостоятельно
        System.out.println("\nНа понижение с деленными на 3: ");
        for (int j = 1000; j >= 0; j--) {
            if (j % 3 == 0)
                System.out.println(j);
        }
    }
}
