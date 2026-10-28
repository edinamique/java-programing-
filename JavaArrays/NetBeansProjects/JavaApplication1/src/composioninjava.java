
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine(); // Car creates its Engine
    }

    void startCar() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class composioninjava {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
