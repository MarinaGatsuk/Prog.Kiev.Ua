package homework2;

public class Dog extends Animal {
    private String name;

    public Dog() {
    }

    public Dog(String ratio, String color, int weight, String name) {
        super(ratio, color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice() {
        return "Woof! Woof!";
    }

    @Override
    public void eat() {
        System.out.println("Dog " + this.name + " is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog " + this.name + " is sleeping!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + "\' " + super.toString() +
                " }";
    }
}
