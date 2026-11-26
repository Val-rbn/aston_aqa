package lesson4.task1;

public class Dog extends Animal {

    private  static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }
}