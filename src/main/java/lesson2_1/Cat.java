package lesson2_1;

public class Cat implements RunAble, JumpAble{
    private String name;
    private int jumpHeight;
    private int runDistance;

    public Cat(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    @Override
    public void run() {
        System.out.println("Кот бегает");
    }
}
