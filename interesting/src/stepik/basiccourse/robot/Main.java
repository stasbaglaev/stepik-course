package stepik.basiccourse.robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 5, 2);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        for (; robot.getDirection() != (robot.getX() > toX ? Direction.LEFT : Direction.RIGHT); robot.turnRight()) {
            System.out.println(robot.getDirection());
            System.out.println((robot.getX() > toX ? Direction.LEFT : Direction.RIGHT));
        }
        System.out.println(robot.getDirection());
        for (int i = 0, iLen = Math.abs(robot.getX() - toX); i < iLen; i++, robot.stepForward()) {
        }
        for (; robot.getDirection() != (robot.getY() > toY ? Direction.DOWN : Direction.UP); robot.turnRight()) {
        }
        for (int i = 0, iLen = Math.abs(robot.getY() - toY); i < iLen; i++, robot.stepForward()) {
        }
        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }


}
