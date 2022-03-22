package lesson2_1;

public class Robot implements RunAble, JumpAble{
    private String name;
    private int jumpHeight;
    private int runDistance;

    public Robot(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public void run() {
        System.out.println("Робот бегает");
    }
}
