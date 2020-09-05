package com.person.core.containers;

import com.person.core.enumeration.Profession;
import com.person.core.model.BasePerson;
import com.person.core.model.Dancer;
import com.person.core.model.Programmer;
import com.person.core.model.Singer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonList {

    private Map<BasePerson,Boolean> persons = new HashMap<>();

    /**
     * Adds person to the list.
     * @param person
     */
    public void add(BasePerson person)
    {
        persons.put(person, true);
    }

    /**
     * Get person by name and surname.
     * @param name
     * @param surname
     * @return
     */
    public BasePerson getByNameAndSurname(String name, String surname)
    {
        for(BasePerson person : persons.keySet())
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
        BasePerson bp = getByNameAndSurname(name, surname);
        persons.put(bp, false);
    }

    /**
     * Get all persons.
     * @return All persons' list.
     */
    public List<BasePerson> getAll() {
        List<BasePerson> result = new ArrayList<>();
        for(BasePerson person: persons.keySet()) {
            result.add(person);
        }
        return result;
    }

    /**
     * Get person by id.
     * @param id
     * @return person by id
     */
    public BasePerson get(int id) {
        for(BasePerson person: persons.keySet()) {
            if(person.getId() == id)
                return person;
        }
        return null;
    }

    /**
     * Get all active persons.
     * @param isActive
     * @return List of active persons.
     */
    public List<BasePerson> get(boolean isActive) {
        List<BasePerson> result = new ArrayList<>();
        for(Map.Entry<BasePerson,Boolean> entry : persons.entrySet()) {
            if(entry.getValue() == isActive) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    /**
     * Get person by profession.
     * @param prof
     * @return List of appropriate profession type persons.
     */
    public List<BasePerson> get(Profession prof) {
        List<BasePerson> result = new ArrayList<>();
        for(Map.Entry<BasePerson,Boolean> entry : persons.entrySet()) {
            if(entry.getKey().getProfession() == prof)
                result.add(entry.getKey());
        }
        return result;
    }

    /**
     * Get all active persons by profession.
     * @param isActive, prof
     * @return List of appropriate profession type active persons.
     */
    public List<BasePerson> get(boolean isActive, Profession prof) {
        List<BasePerson> result = new ArrayList<>();
        for(Map.Entry<BasePerson,Boolean> entry : persons.entrySet()) {
            if(entry.getKey().getProfession() == prof && entry.getValue() == isActive)
                result.add(entry.getKey());
        }
        return result;
    }

    /**
     * Get all unique names of persons.
     * @return result
     */
    public Set<String> getUniqueNames() {
        Set<String> result = new HashSet<>();
        persons.forEach((p, a) -> result.add(p.getName()));
        return result;
    }

    /**
     * Sort based on natural ordering.
     * @return
     */
    public List<BasePerson> sortByNatural() {
        List<BasePerson> result = new ArrayList<>();
        persons.forEach( (p, a) -> result.add(p) );
        Collections.sort(result, Comparator.naturalOrder());
        return result;
    }

    /**
     * Sort based on name.
     * @return
     */
    public List<BasePerson> sortByName() {
        List<BasePerson> result = new ArrayList<>();
        persons.forEach( (p, a) -> result.add(p) );
        Collections.sort(result);
        return result;
    }
}
