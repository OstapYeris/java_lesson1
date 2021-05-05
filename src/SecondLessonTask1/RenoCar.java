package SecondLessonTask1;

public class RenoCar extends Car{

    private Integer tankVolume = 40;
    private Integer numberOfCylinders = 4;
    public static String description = "Reno Car";

//    @Override
//    public Integer carPower() {
//        int horsesCount = 2000;
//    }
//
//    @Override
//    public void carModel() {
//        String model = "Reno";
//    }
//
//    @Override
//    public void carCollor() {
//        String collor = "Green";
//    }

    @Override
    public void carCharacteristics() {
        System.out.println("It is " + description + " it's tank volume is " + tankVolume.toString() + " litras and this car have " + numberOfCylinders.toString() + " celinders");

    }

    @Override
    public void changeCarCollor() {
        System.out.println("You can select " + description + " color");
    }

    public static void descriptionMethod() {
        System.out.println("Description:" + description);
    }


    @Override
    public String toString() {
        return description + "Tank volume: " + tankVolume.toString() + " Number of celinders: " + numberOfCylinders.toString();
    }
}
