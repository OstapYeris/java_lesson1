package StringLessonTask1;

public class Methods {
    String str = "I like Java !!!"; //task a

    public String taskB() {
        String lastChar = str.substring(str.length() - 1);
        return lastChar;
    }

    public void taskC() {
        if (str.endsWith("!!!")) {
            System.out.println("ваш рядок закінчується підрядком \"!!!\"");
        } else {
            System.out.println("ваш рядок не закінчується підрядком \"!!!\"");
        }
    }

    public void taskD() {
        if (str.startsWith("I like")) {
            System.out.println("ваш рядок починається з підрядка \"I like\"");
        } else {
            System.out.println("ваш рядок не починається з підрядка \"I like\"");
        }
    }

    public void taskE() {
        if (str.contains("Java")) {
            System.out.println("ваш рядок містить підрядок \"Java\"");
        } else {
            System.out.println("ваш рядок не містить підрядка \"Java\"");
        }
    }

    public void taskF() {
        System.out.println("позиція підрядка \"Java\" = " + str.indexOf("Java")); // не знаю чи правильно, не знайшов я як шукати позицію іменно слова
    }

    public void taskG() {
        String strWithReplacedChar = str.replace("a", "o");
        System.out.println("Рядок після заміни \"а\" на \"о\": " + strWithReplacedChar);
    }

    public void taskH() {
        System.out.println("Рядок в верхньому регістрі: " + str.toUpperCase());
    }

    public void taskJ() {
        System.out.println("Рядок в нижньому регістрі: " + str.toLowerCase());
    }

    public void taskK() {
        String strAfterCutJava = str.substring(0, 7) + str.substring(12, 15);
        System.out.println("Вирізав \"Java\": " + strAfterCutJava); // не знаю чи треба було вирізати джава і вивести його, чи вирізати джава і вивести все інше, тому зробив так)
    }
}
