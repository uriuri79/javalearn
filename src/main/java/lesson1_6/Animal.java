package lesson1_6;

import jdk.swing.interop.SwingInterOpUtils;

public class Animal {
    protected String name;
    protected int runDistance;
    protected int swimDistance;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void run(int runDistance) {
        System.out.println(name + " пробежал " + runDistance + " метров.");
    }

    void swim(int swimDistance) {
        System.out.println(name + " проплыл " + swimDistance + " метров");
    }
}
