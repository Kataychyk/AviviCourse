package lection5;

public class CofeeRobot extends Robot {
    void work() {
        System.out.println("Я Robot – я варю каву");
    }

    public static void main(String[] args) {
        Robot robot = new CofeeRobot();
        robot.work();
    }
}