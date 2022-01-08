package homework9;

public enum Gender {
    MALE ("M"), FEMALE ("F");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Gender{}";
    }
}
