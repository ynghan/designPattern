package StrategyPatternSimple;

public class RailLoadStrategy implements MovableStrategy {
    public void move() {
        System.out.println("선로를 통해 이동");
    }
}
