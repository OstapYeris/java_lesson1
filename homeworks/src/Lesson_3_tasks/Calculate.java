package Lesson_3_tasks;

public class Calculate {

    public static void main(String args[]) {

            int rectPerimetr = new Rectangle().calculateRectanglePerimeter();
            int rectSquare = new Rectangle().calculateRectangleSquare();

            float circLenght = new Circle().calculateCircleLenght();
            float circSquare = new Circle().calculateCircleSquare();

        System.out.println("Периметр прямокутника = " + rectPerimetr);
        System.out.println("Площа прямокутника = " + rectSquare);
        System.out.println("Довжина кола = " + circLenght);
        System.out.println("Площа кола = " + circSquare);
    }
}
