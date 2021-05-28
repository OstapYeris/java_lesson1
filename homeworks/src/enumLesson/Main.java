package enumLesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i >= 0; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть назву машини");
            String carCharacteristics = scanner.nextLine(); //чого scanner.nextLine, якщо можна просто scanner.next - результат той самий
            if (carCharacteristics.equals("exit")) { // Не получилось додати toLowerCase()
                System.out.println("До побачення");
                return;
            }
            System.out.println(Cars.returnValues(carCharacteristics));
        }
    }
}