package Lesson_2_tasks;

public class Task3 {
    public static void main(String[] args) {
//        int[][] matrix;
//        matrix = new int[5][7];
        int a = (int) (-2 + (Math.random() * 75));
//        int b = (int) (-2 + (Math.random() * 75));
//        int c = (int) (-2 + (Math.random() * 75));
//        int d = (int) (-2 + (Math.random() * 75));

        int matrix[][] = {
                {(int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75))},
                {(int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75))},
                {(int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75))},
                {(int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75))},
                {(int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75)), (int) (-2 + (Math.random() * 75))},
        };
//        for (int i = 0; i < 5; i++) {
//            System.out.println(matrix[i]);
//        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "   ");
            System.out.println();
        }
    }
}
