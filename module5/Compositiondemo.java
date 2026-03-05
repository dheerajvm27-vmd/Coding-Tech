package module5;
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private Engine engine;

    public Car(String engineType) {
        this.engine = new Engine(engineType);
    }

    public void show() {
        System.out.println("Car has engine type: " + engine.getType());
    }
}

public class Compositiondemo {
    public static void main(String[] args) {
        Car c = new Car("Petrol Engine");
        c.show();
    }
}