package homework9;

public class GroupOverflowException extends Exception {

    public GroupOverflowException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "GroupOverflowException{}";
    }
}
