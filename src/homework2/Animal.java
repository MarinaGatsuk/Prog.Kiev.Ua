package homework2;

public class Animal {
    private String ratio;
    private String color;
    private int weight;

    public Animal() {

    }

    public Animal(String ratio, String color, int weight) {
        this.ratio = ratio;
        this.color = color;
        this.weight = weight;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getVoice() {
        return "Animal voice";
    }

    public void eat() {
        System.out.println("Animal is eating!");
    }

    public void sleep(){
        System.out.println("Animal is sleeping!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ratio='" + ratio + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }


}
