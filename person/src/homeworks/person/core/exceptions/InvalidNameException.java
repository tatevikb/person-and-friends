package homeworks.person.core.exceptions;

public class InvalidNameException extends RuntimeException {

    public InvalidNameException()
    {
        super("Invalid name!");
    }
}
