package Strategy;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.move();

        car.setMove(new RailRoadStrategy());
        car.move();

        car.setMove(new RoadStrategy());
        car.move();
    }

}
