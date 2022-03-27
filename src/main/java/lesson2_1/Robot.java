package lesson2_1;

public class Robot implements Playable{
    private String name;
    private Integer jumpHeight;
    private Integer runDistance;
    private boolean isPlaying;

    public Robot(String name, Integer jumpHeight, Integer runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void jump(Barrier height) {
        if (jumpHeight < height.getHeight()) {
            System.out.println("Робот " + name +" не перепрыгнул, дальше не участвует");
            isPlaying = false;
        } else {
            System.out.println("Робот " + name +" перепрыгнул");
            isPlaying = true;
        }
    }

    @Override
    public void checkedWin() {
        if (this.isPlaying == false) {
            System.out.println(name + " не участвует");
        }
    }

    @Override
    public void run(RunningTrack track) {
        if (runDistance < track.getLength()) {
            System.out.println("Робот " + name + " не пробежал, дальше не участвует");
            isPlaying = false;
        } else {
            System.out.println("Робот " + name + " пробежал");
            isPlaying = true;
        }
    }
}
