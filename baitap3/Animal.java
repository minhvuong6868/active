package baitap3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

abstract class Animal {
    // Phương thức ăn
    public abstract void eat();

    // Phương thức làm tiếng kêu
    public abstract void makeSound();

    // Phương thức bay
    public abstract void fly();

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Cat myCat = new Cat();
        Bird myBird = new Bird();
        myCat.eat();
        myCat.makeSound();
        myCat.run();
        myCat.fly();

        myBird.eat();
        myBird.makeSound();
        myBird.fly();
    }
}
