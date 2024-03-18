package lesson16.homework;

public class InvalidPassword extends Throwable {
    public InvalidPassword(String message) {
        super(message);
    }
}
