package stepik.basiccourse.all.exception42;

public class Main {
    public static void main(String[] args) {
        moveRobot(new Robot(), 5, 2);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 1; i <= 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException exception) {
                if (i == 3) {
                    throw new RobotConnectionException("");
                }
            }
        }
    }

}
