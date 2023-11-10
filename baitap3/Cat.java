package baitap3;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Mèo đang ăn cá");
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void run() {
        System.out.println("Mèo có thể chạy");
    }

    @Override
    public void fly() {
        System.out.println("Mèo thì không thể bay");
    }
}
