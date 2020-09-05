package com.person.core.model;

import com.person.core.enumeration.ActionType;
import com.person.core.enumeration.GenderType;
import com.person.core.enumeration.Profession;
import com.person.core.exceptions.ValidationException;
import com.person.core.service.PersonAction;
import com.person.core.service.factory.PersonFactory;
import com.person.utils.Validator;

public abstract class BasePerson implements Comparable<BasePerson> {
    protected int id;
    protected String name;
    protected String lastName;
    protected String surname;
    protected String nickname;
    protected int age;
    protected String email;
    protected GenderType  gender;

    private static final String NAME_REGEXP = "^[A-Z][a-z]*$";
    private static final String NICKNAME_REGEXP = "^[a-z0-9]+$";
    private static final String MAIL_REGEXP = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    protected PersonAction actions;

    BasePerson() {}

    public BasePerson(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.surname = builder.surname;
        this.nickname = builder.nickname;
        this.age = builder.age;
        this.email = builder.email;
        this.gender = GenderType.valueOf(builder.gender);
    }

    public int getId()
    {
        return id;
    }

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
        if(!Validator.gender(GenderType.valueOf(gender)))
            throw new ValidationException("Invalid gender!");

        this.gender = GenderType.valueOf(gender);
    }

    /**
     * Get the value of gender
     * @return the value of gender
     */
    public GenderType getGender() { return gender; }

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

    public abstract void act(ActionType action);

    public abstract Profession getProfession();

    @Override
    public int compareTo(BasePerson bp) {
        return name.compareTo(bp.getName());
    }

    public static class Builder {
        protected String name;
        protected String lastName;
        protected String surname;
        protected String nickname;
        protected int age;
        protected String email;
        protected String gender;
        protected Profession profession;

        public Builder(Profession profession) {
            this.profession = profession;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public BasePerson build() {
            BasePerson person = PersonFactory.create(profession);
            person.setName(name);
            person.setLastName(lastName);
            person.setSurname(surname);
            person.setNickname(nickname);
            person.setAge(age);
            person.setEmail(email);
            person.setGender(gender);
            return person;
        }
    }

}
