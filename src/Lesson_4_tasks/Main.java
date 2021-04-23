package Lesson_4_tasks;

public class Main {
    public static void main(String args[]) {
        Robot robot = new Robot();
        robot.work();

        Robot CoffeRobot = new CoffeRobot();
        CoffeRobot.work();

        Robot RobotCoocker = new RobotCoocker();
        RobotCoocker.work();

        Robot RobotDancer = new RobotDancer();
        RobotDancer.work();

        Robot[] robots = {new Robot(), new CoffeRobot(), new RobotCoocker(), new RobotDancer()};
        for (Robot robi:robots) {
            robi.work();
        }
    }
}
