package B2;

public class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        } else {
            throw new IllegalArgumentException("Invalid animal type: " + type);
        }
    }
}
