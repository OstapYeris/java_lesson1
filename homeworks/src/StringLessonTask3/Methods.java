package StringLessonTask3;

import java.util.Scanner;

public class Methods {

    Scanner scanner = new Scanner(System.in);
    String stringFromScaner = scanner.nextLine();

    public void getStringFromScaner() {

        for (int i = 0; i < stringFromScaner.length(); i++) {

            String[] words = stringFromScaner.split(" ");

            int wordsLenght = words[i].length();

            if (wordsLenght % 2 == 0 && words[i].startsWith("a")) {
                System.out.println(words[i]);
            }

        }
    }
}
