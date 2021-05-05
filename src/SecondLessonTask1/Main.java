package SecondLessonTask1;

public class Main {
    public static void main(String args[]) {
        System.out.println("General characteristics:");
        new Car().carCharacteristics();
        new Car().changeCarCollor();
        System.out.println("");

        System.out.println("Reno car characteristics:");
        new RenoCar().carCharacteristics();
        new RenoCar().changeCarCollor();
        new RenoCar().descriptionMethod();
        String renoToString = new RenoCar().toString();
        System.out.println(renoToString);
        System.out.println("");

        System.out.println("Skoda car characteristics:");
        new SkodaCar().carCharacteristics();
        new SkodaCar().descriptionMethod();
        String skodaToString = new SkodaCar().toString();
        System.out.println(skodaToString);
        System.out.println("");

        System.out.println("Volkswagen car characteristics:");
        new VolkswagenCar().carCharacteristics();
        new VolkswagenCar().changeCarCollor();
        new VolkswagenCar().descriptionMethod();
        String volkswagenToString = new SkodaCar().toString();
        System.out.println(volkswagenToString);


    }
}
