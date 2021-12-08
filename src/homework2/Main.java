package homework2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ("Fish", "Black", 4, "Barsik");
        Dog dog = new Dog ("Meat", "White", 25, "Sharik");

        System.out.println(cat.getName() + " says: " + cat.getVoice());
        cat.eat();
        cat.sleep();

        System.out.println(dog.getName() + " says: " + dog.getVoice());
        dog.eat();
        dog.sleep();

        Veterinarian veterinarian = new Veterinarian("Viktor Ivanovych");

        veterinarian.treatment(cat);
        veterinarian.treatment(dog);

        Animal animal = new Animal ("Grass", "Grey", 2);
        System.out.println("Animal has voice: " + animal.getVoice());
        animal.eat();
        animal.sleep();

        veterinarian.treatment(animal);

    }
}
