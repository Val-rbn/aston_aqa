package lesson4.task1;

public abstract class Animal {
    protected String name;
    private static int count = 0;
    public Animal(String name) {
        this.name = name;
        count++;
    }
    public static int getCount() {
        return count;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}

