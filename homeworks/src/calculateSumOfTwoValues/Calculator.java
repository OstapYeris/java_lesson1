package calculateSumOfTwoValues;

import java.util.Scanner;

public class Calculator {

    public static Double showResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        Double value1 = scanner.nextDouble();
        System.out.println("Введіть друге число");
        Double value2 = scanner.nextDouble();
        Double result = value1 + value2;
        System.out.println("Результат:");
        return result;
    }
}
