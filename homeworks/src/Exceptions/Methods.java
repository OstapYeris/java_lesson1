package Exceptions;

import java.util.Scanner;

public class Methods {

    public static void sumWithExceptions() throws Exception {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Додавання 2ох чисел");
        System.out.println("Введіть перше число:");
        Double a = scaner.nextDouble();
        System.out.println("Введіть друге число:");
        Double b = scaner.nextDouble();
        Double c = a+b;

        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("One of the numbers is < 0");
        } else if ((a == 0 && b != 0)|| (a != 0 && b == 0)) {
            throw new ArithmeticException("Arithmetic error (a = 0 && b!=0) || (a != 0 && b=0)");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("All numbers = 0");
        } else if (a > 0 && b > 0) {
            throw new MyExceptions();
        }
        System.out.println(c);
    }

    public static void subtractionWithExceptions() throws Exception {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Віднімання 2ох чисел");
        System.out.println("Введіть перше число:");
        Double a = scaner.nextDouble();
        System.out.println("Введіть друге число:");
        Double b = scaner.nextDouble();
        Double c = a-b;

        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("One of the numbers is < 0");
        } else if ((a == 0 && b != 0)|| (a != 0 && b == 0)) {
            throw new ArithmeticException("Arithmetic error (a = 0 && b!=0) || (a != 0 && b=0)");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("All numbers = 0");
        } else if (a > 0 && b > 0) {
            throw new MyExceptions();
        }
        System.out.println(c);
    }

    public static void divisionWithExceptions() throws Exception {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ділення 2ох чисел");
        System.out.println("Введіть перше число:");
        Double a = scaner.nextDouble();
        System.out.println("Введіть друге число:");
        Double b = scaner.nextDouble();
        Double c = a/b;

        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("One of the numbers is < 0");
        } else if ((a == 0 && b != 0)|| (a != 0 && b == 0)) {
            throw new ArithmeticException("Arithmetic error (a = 0 && b!=0) || (a != 0 && b=0)");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("All numbers = 0");
        } else if (a > 0 && b > 0) {
            throw new MyExceptions();
        }
        System.out.println(c);
    }

    public static void multiplicationWithExceptions() throws Exception {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ділення 2ох чисел");
        System.out.println("Введіть перше число:");
        Double a = scaner.nextDouble();
        System.out.println("Введіть друге число:");
        Double b = scaner.nextDouble();
        Double c = a*b;

        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("One of the numbers is < 0");
        } else if ((a == 0 && b != 0)|| (a != 0 && b == 0)) {
            throw new ArithmeticException("Arithmetic error (a = 0 && b!=0) || (a != 0 && b=0)");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("All numbers = 0");
        } else if (a > 0 && b > 0) {
            throw new MyExceptions();
        }
        System.out.println(c);
    }
}
// був ше такий варіант як зробити через ексепшини, але тоді не ясно кий саме ексепшин було викинуто.
//
//    public static void sumWithExceptions() throws Exception {
//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Додавання 2ох чисел");
//        System.out.println("Введіть перше число:");
//        Double a = scaner.nextDouble();
//        System.out.println("Введіть друге число:");
//        Double b = scaner.nextDouble();
//        Double c = a+b;
//        try {
//            if (a < 0 && b < 0) {
//                throw new IllegalArgumentException("One of the numbers is < 0");
//            } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
//                throw new ArithmeticException("Arithmetic error (a = 0 && b!=0) || (a != 0 && b=0)");
//            } else if (a == 0 && b == 0) {
//                throw new IllegalAccessException("All numbers = 0");
//            } else if (a > 0 && b > 0) {
//                throw new MyExceptions();
//            }
//        } catch (Exception e){
//            System.err.println("An exception was thrown");
//        }
//        System.out.println(c);
//    }