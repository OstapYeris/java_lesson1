package checkIfNumberIsOdd;

import java.util.Scanner;

public class CheckIfOdd {

    public static void check() {
        for (double i = 0; i >= 0; i++) {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Введіть число:");

            Double number = scaner.nextDouble();
//            System.out.println(number % 2);
            if (number % 2 == 0) {
                System.out.println("Число парне");
            } else if (number % 2 == 1) {
                System.out.println("Число не парне");
            } else {
                System.out.println("Введено не коректні дані, введіть ціле число");
            }
        }
    }
}

// Не розумію, чому на дробові числа, каже що введено не коректні дані.