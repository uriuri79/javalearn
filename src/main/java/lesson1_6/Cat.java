package lesson1_6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void run(int runDistance) {
        if (runDistance <= 200) {
            super.run(runDistance);
        } else {
            System.out.println(name + " столько не пробежит!");
        }
    }

    @Override
    void swim(int swimDistance) {
        System.out.println(name + " не плавает!!!");;
    }
}
