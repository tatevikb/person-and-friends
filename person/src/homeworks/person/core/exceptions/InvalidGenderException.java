package homeworks.person.core.exceptions;

public class InvalidGenderException extends RuntimeException{

    public InvalidGenderException()
    {
        super("Invalid gender!");
    }
}
