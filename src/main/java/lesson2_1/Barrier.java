package lesson2_1;

public class Barrier {
    private int height;

    public Barrier(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void jumpComplete(int jumpHeight) {
        if (jumpHeight >= height) {
            System.out.println("Участник успешно перепрыгнул");
        } else {
            System.out.println("Участник не смог перепрыгнуть");
        }
    }
}
