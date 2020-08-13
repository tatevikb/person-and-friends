package com.person.core.containers;

import com.person.core.model.BasePerson;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private List<BasePerson> people = new ArrayList<>();

    /**
     * Adds person to the list.
     * @param person
     */
    public void add(BasePerson person)
    {
        people.add(person);
    }

    /**
     * Get person by name and surname.
     * @param name
     * @param surname
     * @return
     */
    public BasePerson get(String name, String surname)
    {
        for(BasePerson i: people)
        {
            if(i.getName().equals(name) && i.getSurname().equals(surname)) {
                return i;
            }
        }
        return null;
    }

    /**
     * Removes person from the list.
     */
    public void remove(String name, String surname)
    {
        BasePerson bp = get(name, surname);
        people.remove(bp);
    }
}
