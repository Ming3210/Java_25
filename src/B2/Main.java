package B2;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("Dog");
        dog.speak();
        Animal cat = AnimalFactory.createAnimal("Cat");
        cat.speak();
    }
}
