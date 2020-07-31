package homeworks.person.core.impl;

public interface  PersonFactory extends PersonAction {
    PersonAction getPersonAction(String personType);
}
