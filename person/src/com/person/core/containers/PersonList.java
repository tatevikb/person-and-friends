package com.person.core.containers;

import com.person.core.model.BasePerson;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private List<BasePerson> persons = new ArrayList<>();

    /**
     * Adds person to the list.
     * @param person
     */
    public void add(BasePerson person)
    {
        persons.add(person);
    }

    /**
     * Get person by name and surname.
     * @param name
     * @param surname
     * @return
     */
    public BasePerson getByNameAndSurname (String name, String surname)
    {
        for(BasePerson person: persons)
        {
            if(person.getName().equals(name) && person.getSurname().equals(surname)) {
                return person;
            }
        }
        return null;
    }

    /**
     * Removes person from the list.
     */
    public void remove(String name, String surname)
    {
        BasePerson bp = getByNameAndSurname (name, surname);
        persons.remove(bp);
    }
}
