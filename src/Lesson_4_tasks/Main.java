package Lesson_4_tasks;

public class Main {
    public static void main(String args[]) {
        Robot robot = new Robot();
        robot.work();

        Robot coffeRobot = new CoffeRobot();
        coffeRobot.work();

        Robot robotCoocker = new RobotCoocker();
        robotCoocker.work();

        Robot robotDancer = new RobotDancer();
        robotDancer.work();

        Robot[] robots = {new Robot(), new CoffeRobot(), new RobotCoocker(), new RobotDancer()};
        for (Robot robi:robots) {
            robi.work();
        }
    }
}
