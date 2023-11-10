package baitap3;

public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Con chim đang ăn sâu");
    }

    @Override
    public void makeSound() {
        System.out.println("Con chim đang hót");
    }

    @Override

    public void fly() {
        System.out.println("Con chim có thể bay");
    }
}
