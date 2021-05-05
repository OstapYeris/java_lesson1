package SecondLessonTask1;

public class Car {
    private String color = "Color";
    private String model = "Model";
    private Integer horsesCount = 1000;
    public static String description = "Car";

//    public Integer carPower() {
//        this.horsesCount = 1500;
//        return horsesCount;
//    }

//    public void carModel() {
//
//       this.model = "Model";
//    }
//
//    public void carCollor() {
//        this.color = "blue";
//    }

    public void carCharacteristics() {
        System.out.println("Car model is " + model + "it's standart collor is " + color + " and it's power is "
                + horsesCount.toString() + " horsepower");

    }

    public void changeCarCollor() {
        System.out.println("You can select " + description + color + "if you want");
    }

}
