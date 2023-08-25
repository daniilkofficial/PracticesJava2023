package lp21and23collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] employees = getEmployees();
        String[] newArray = new String[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newArray[i] = employees[i];
        }

        newArray[newArray.length - 1] = "James";
        employees = newArray;
        employees[0] = null;

        String[] newestArray = new String[employees.length - 1];
        for (int i = 0, j = 0; i < employees.length; i++) {
            String employee = employees[i];
            if (employee != null) {
                newestArray[j] = employee;
                j++;
            }
        }
        employees = newestArray;
        for (String employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nList:");

        // Собственная реализация коллекции
//        MyArrayList list = getList(); // Правки с LP23
        ArrayList<String> list = getList();
        list.add("James");
        list.remove("Emma");
        list.remove(0);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for (String element : list) {
            System.out.println(element);
        }

        // С LP23
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        // ДЗ с LP23.
        // Создайте две коллекции:
        // Первая содержит имена - 5 шт.
        // Вторая содержит числа - 5 шт.
        // Создайте третью коллекцию которая хранит строки, значение: число - имя.
        ArrayList<String> names = getList();
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(25);
        ages.add(26);
        ages.add(27);
        ages.add(34);
        ArrayList<String> namesAndAges = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            namesAndAges.add(ages.get(i) + " - " + names.get(i));
        }
        for (String nameAndAge : namesAndAges) {
            System.out.println(nameAndAge);
        }


        System.out.println();
        HashSet<String> listHash = getHashSet();
        // хранение без порядка элементов и нельзя одинаковые, без метода get
        for (String name : listHash) {
            System.out.println(name);
        }
    }

    // Правки с LP23
    private static ArrayList<String> getList() {
        // Generic - обобщенные типы
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Olivia");
        list.add("Emma");
        list.add("Max");
        list.add("Nick");
        return list;
    }

    private static HashSet<String> getHashSet() {
        HashSet<String> list = new HashSet<>();
        list.add("John");
        list.add("Olivia");
        list.add("Emma");
        list.add("Max");
        list.add("Nick");
        return list;
    }

//    private static MyArrayList getList() {
//        MyArrayList list = new MyArrayList();
//        list.add("John");
//        list.add("Olivia");
//        list.add("Emma");
//        list.add("Max");
//        list.add("Nick");
//        return list;
//    }

    private static String[] getEmployees() {
        String[] employees = new String[5];
        employees[0] = "John";
        employees[1] = "Olivia";
        employees[2] = "Emma";
        employees[3] = "Max";
        employees[4] = "Nick";
        return employees;
    }

}
