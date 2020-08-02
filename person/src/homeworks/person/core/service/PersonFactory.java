package homeworks.person.core.service;

public interface  PersonFactory extends PersonAction {
    PersonAction getPersonAction(String personType);
}
