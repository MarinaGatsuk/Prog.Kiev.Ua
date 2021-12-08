package homework2;

public class Cat extends Animal {
    private String name;

    public Cat() {
    }

    public Cat(String ratio, String color, int weight, String name) {
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
        return "Meow! Meeeoooow!";
    }

    @Override
    public void eat() {
        System.out.println("Cat " + this.name + " is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + this.name + " is sleeping!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + "\' " + super.toString() +
                " }";
    }
}
