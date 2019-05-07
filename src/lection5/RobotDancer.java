package lection5;

public class RobotDancer extends Robot {
    void work(){
        System.out.println("Я Robot – я просто танцюю");
    }

    public static void main(String[] args) {
        Robot robot = new RobotDancer();
        robot.work();
    }
}
