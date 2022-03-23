package lesson2_1;

public class Cat implements Playable{
    private String name;
    private Integer jumpHeight;
    private Integer runDistance;
    private boolean isPlaying;

    public Cat(String name, Integer jumpHeight, Integer runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void jump(Barrier height) {
        if (jumpHeight < height.getHeight()) {
            System.out.println("Кот " + name +" не перепрыгнул");
            isPlaying = false;
        } else {
            System.out.println("Кот " + name +" перепрыгнул");
            isPlaying = true;
        }
    }

    @Override
    public void run(RunningTrack track) {
        if (runDistance < track.getLength()) {
            System.out.println("Кот " + name + " не пробежал");
            isPlaying = false;
        } else {
            System.out.println("Кот " + name +" пробежал");
            isPlaying = true;
        }
    }
}
