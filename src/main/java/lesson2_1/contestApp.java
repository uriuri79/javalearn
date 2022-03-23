package lesson2_1;

public class contestApp {
    public static void main(String[] args) {

        Playable[] players = new Playable[6];
        players[0] = new Cat("cat1", 5, 10);
        players[1] = new Robot("robot1",1, 2);
        players[2] = new Human("human1",10, 20);
        players[3] = new Cat("cat2",4, 8);
        players[4] = new Robot("robot2",2, 3);
        players[5] = new Human( "human2",15, 25);

        Obstacle [] obstacles = new Obstacle[4];
        obstacles[0] = new RunningTrack(2);
        obstacles[1] = new Barrier(1);
        obstacles[2] = new RunningTrack(8);
        obstacles[3] = new Barrier(3);

        for (Obstacle obstacle : obstacles) {
            for (Playable player : players)  {
                obstacle.overcome(player);
            }
        }
    }
}
