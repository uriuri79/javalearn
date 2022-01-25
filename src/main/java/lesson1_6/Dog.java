package lesson1_6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void run(int runDistance) {
        if (runDistance <= 500) {
            super.run(runDistance);
        } else {
            System.out.println(name + " столько не пробежит!");
        }
    }

    @Override
    void swim(int swimDistance) {
        if (swimDistance <= 10) {
            super.swim(swimDistance);
        } else {
            System.out.println(name + " столько не проплывет!");
        }
    }
}
