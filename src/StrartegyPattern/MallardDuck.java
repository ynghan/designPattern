package StrartegyPattern;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new Flywithwings();
    }

    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
