package homework2;

public class Veterinarian {
    private String name;

    public Veterinarian() {
    }

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment (Animal animal) {
        if (animal.getClass() == Cat.class) {
            System.out.println("The cat " + ((Cat) animal).getName() + " is cured!");
        }
        else if (animal.getClass() == Dog.class) {
            System.out.println("The dog " + ((Dog) animal).getName() + " is cured!");
        }
        else {
            System.out.println("Animal is cured!");
        }
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
}
