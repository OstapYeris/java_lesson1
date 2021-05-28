package SecondLessonTask1;

public class SkodaCar extends Car{
    private Integer warrantyPeriod  = 3;
    public static String description = "Volkswagen Car";


    @Override
    public void carCharacteristics() {
        System.out.println("It is " + description + " its warranty period is " + warrantyPeriod.toString() + " years");

    }

    public static void descriptionMethod() {
        System.out.println("Description: " + description);
    }

    @Override
    public String toString() {
        return description + "warranty period: " + warrantyPeriod.toString() + " years";
    }
}
