package lesson2_1;

public class RunningTrack implements Obstacle{
    private Integer length;

    public RunningTrack(Integer length) {
        this.length = length;
    }

    public Integer getLength() {
        return length;
    }

    @Override
    public void overcome(Playable player) {
        player.run(this);
    }
}

