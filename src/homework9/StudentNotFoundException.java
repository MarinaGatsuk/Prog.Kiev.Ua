package homework9;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "StudentNotFoundException{}";
    }
}
