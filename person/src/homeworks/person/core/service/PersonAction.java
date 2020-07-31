package homeworks.person.core.service;

public interface PersonAction {
    void learn();
    void eat();
    default void walk()
    {
        System.out.println("the rest of the people are walking the same way.");
    }
}
