package B3;

public class CarBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }

    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    public Car build() {
        return car;
    }
}