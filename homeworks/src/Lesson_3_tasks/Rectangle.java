package Lesson_3_tasks;

class Rectangle {
    private int length;
    private int width;

    Rectangle() {
        length = 12;
        width = 13;
    }

    int calculateRectanglePerimeter() {
        int perimetr = this.width * 2 + this.length * 2;
        return perimetr;
    }

    int calculateRectangleSquare() {
        int square = this.width * this.length;
        return square;
    }
}
