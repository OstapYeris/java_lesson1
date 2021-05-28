package Lesson_2_tasks;

public class Task2 {

    public static void main(String[] args) {
//        int[] array1 = new int[4];

//        array1[0]=5;
//        array1[1]=17;
//        array1[2]=350;
//        array1[3]=33;

//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//        System.out.println(array1[3]);

        System.out.println("array in the right direction");
        int[] array1 = {5, 9, 15, 25};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("array in the opposite direction");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i]);
        }


    }


}
