package lesson2_1;

public class Barrier implements Obstacle{
    private Integer height;

    public Barrier(Integer height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome(Playable player) {
        player.jump(this);
    }
}
