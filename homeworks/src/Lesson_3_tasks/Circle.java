package Lesson_3_tasks;

class Circle {
    private float radius;
    private float diameter;

    Circle() {
        radius = (float) 12.22;
        diameter = (float) 24.44;
    }

    float calculateCircleLenght() {
        float lenght = (float) (2 * Math.PI * radius);
        return lenght;
    }

    float calculateCircleSquare() {
        float circleSquare = (float) ((Math.PI * (diameter * diameter) / 4));
        return circleSquare;
    }
}
