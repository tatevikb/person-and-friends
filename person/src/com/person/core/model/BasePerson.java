package com.person.core.model;

import com.person.core.exceptions.ValidationException;
import com.person.core.service.PersonAction;
import com.person.utils.Validator;

public abstract class BasePerson implements PersonAction {
    protected String name;
    protected String lastName;
    protected String surname;
    protected String nickname;
    protected int age;
    protected String email;
    protected String  gender;

    private static final String NAME_REGEXP = "^[A-Z][a-z]*$";
    private static final String NICKNAME_REGEXP = "^[a-z0-9]+$";
    private static final String MAIL_REGEXP = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    protected PersonAction actions;

    public BasePerson() {}

    /**
     * Set the value of name
     * @param name the new value of name
     */
    public void setName(String name)
    {
        if(!Validator.names(name, NAME_REGEXP))
            throw new ValidationException("Invalid name!");

        this.name = name;
    }

    /**
     * Get the value of name
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the value of lastName
     * @param lastName the new value of lastName
     */
    public void setLastName(String lastName)
    {
        if(!Validator.names(lastName, NAME_REGEXP))
            throw new ValidationException("Invalid last name!");

        this.lastName = lastName;
    }

    /**
     * Get the value of lastName
     * @return the value of lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Set the value of surname
     * @param surname the new value of surname
     */
    public void setSurname(String surname)
    {
        if(!Validator.names(surname, NAME_REGEXP))
            throw new ValidationException("Invalid surname!");

        this.surname = surname;
    }

    /**
     * Get the value of surname
     * @return the value of surname
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * Set the value of nickname
     * @param nickname the new value of nickname
     */
    public void setNickname(String nickname)
    {
        if(!Validator.names(nickname, NICKNAME_REGEXP))
            throw new ValidationException("Invalid nickname!");

        this.nickname = nickname;
    }
    /**
     * Get the value of nickname
     * @return the value of nickname
     */
    public String getNickname()
    {
        return nickname;
    }

    /**
     * Set the value of email
     * @param email the new value of email
     */
    public void setEmail(String email)
    {
        if(!email.matches(MAIL_REGEXP))
            throw new ValidationException("Invalid email!");

        this.email = email;
    }

    /**
     * Get the value of email
     * @return the value of email
     */
    public String getEmail() { return email; }

    /**
     * Set the value of age
     * @param age the new value of age
     */
    public void setAge(int age)
    {
        if(!Validator.age(age))
            throw new ValidationException("Invalid age!");

        this.age = age;
    }

    /**
     * Get the value of age
     * @return the value of age
     */
    public int getAge() { return age; }

    /**
     * Set the value of gender
     * @param gender the new value of gender
     */
    public void setGender(String gender)
    {
        if(!Validator.gender(gender))
            throw new ValidationException("Invalid gender!");

        this.gender = gender;
    }

    /**
     * Get the value of gender
     * @return the value of gender
     */
    public String getGender() { return gender; }

    /**
     * Set the value of designation
     * @param designation the new value of designation
     */
    public abstract void setDesignation(String designation);

    /**
     * Get the value of designation
     * @return the value of designation
     */
    public abstract String getDesignation();

    /**
     * Performs given action.
     * @param actionType
     */
    //public abstract void act(String actionType);
}
