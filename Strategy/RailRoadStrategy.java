package Strategy;

public class RailRoadStrategy implements MovableStrategy {
    @Override
    public void move() {
        System.out.println("선로를 통해 이동.");
    }
}
