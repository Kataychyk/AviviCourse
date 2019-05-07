package lection5;

public class RobotCoocker extends Robot {
    void work(){
        System.out.println("Я Robot – я просто готую");
    }

    public static void main(String[] args) {
        Robot robot = new RobotDancer();
        robot.work();
    }
}
