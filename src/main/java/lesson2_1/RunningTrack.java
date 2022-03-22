package lesson2_1;

public class RunningTrack {
        private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void runComplete(int runDistance) {
            if (runDistance >= distance) {
                System.out.println("Участник успешно пробежал");
            } else {
                System.out.println("Участник не смог пробежать");
            }
        }
    }