package B3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new CarBuilder()
                .setEngine("Unreal Engine")
                .setSeats(5)
                .setColor("Black")
                .build();

        Car car2 = new CarBuilder()
                .setEngine("Unity")
                .setSeats(7)
                .setColor("White")
                .build();

        System.out.println("Car1: " + car1.getEngine() + " " + car1.getSeats()+ " " + car1.getColor());
        System.out.println("Car2: " + car2.getEngine()+ " " + car2.getSeats()+ " " + car2.getColor());
    }
}