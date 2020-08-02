package homeworks.person.core.exceptions;

public class PersonNotSupportedException extends RuntimeException {
    public PersonNotSupportedException()
    {
        super("Person not supported!");
    }
}
