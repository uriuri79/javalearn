package lesson2_1;

public class contestApp {
    public static void main(String[] args) {

        Object [] players = new Object[6];
        players[0] = new Cat("Barsik", 5, 10);
        players[1] = new Robot("RobFirst", 1, 2);
        players[2] = new Human("John Johnson", 10, 20);
        players[3] = new Cat("Murzik", 4, 8);
        players[4] = new Robot("RobSecond", 2, 3);
        players[5] = new Human("Mike Michelson", 15, 25);

        Object [] obstacles = new Object[4];
        obstacles[0] = new RunningTrack(2);
        obstacles[1] = new Barrier(1);
        obstacles[2] = new RunningTrack(8);
        obstacles[3] = new Barrier(3);

        System.out.println(players[0]);
        System.out.println(obstacles[0]);
    }
}
