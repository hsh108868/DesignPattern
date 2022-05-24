package Strategy;

public class Car {
    private MovableStrategy movableStrategy;

    public void setMove(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }

    public void move() {
        if (movableStrategy == null) {
            System.out.println("정지 상태");
        } else {
            movableStrategy.move();
        }
    }

}
