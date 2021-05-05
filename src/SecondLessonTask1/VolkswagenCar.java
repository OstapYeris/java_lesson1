package SecondLessonTask1;

public class VolkswagenCar extends Car{
    private Integer passengersCount = 4;
    private Integer numberOfWheel = 4;
    public static String description = "Volkswagen Car";


    @Override
    public void carCharacteristics() {
        System.out.println("It is " + description + " it  can transport " + passengersCount.toString() + " passengers and it has " + numberOfWheel.toString() + " wheels");

    }

    @Override
    public void changeCarCollor() {
        System.out.println("You can select " + description + " color");
    }

    public static void descriptionMethod() {
        System.out.println("Description: " + description);
    }


    @Override
    public String toString() {
        return description + "Passengers count: " + passengersCount.toString() + " number of wheels: " + numberOfWheel.toString();
    }
}
