package homeworks.person.core.model;

import homeworks.person.core.exceptions.InvalidAgeException;
import homeworks.person.core.exceptions.InvalidGenderException;
import homeworks.person.core.exceptions.InvalidNameException;
import homeworks.person.core.service.PersonAction;
import homeworks.person.utils.Validate;

public abstract class BasePerson implements PersonAction {
    protected String name;
    protected String lastName;
    protected String surname;
    protected String nickname;
    protected int age;
    protected String email;
    protected String  gender;

    private static final String nameRegexp = "^[A-Z][a-z]*$";
    private static final String nicknameRegexp = "^[a-z0-9]+$";
    private static final String mailRegexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    protected PersonAction actions;

    public BasePerson() {}


    public void setName(String name)
    {
        if(!Validate.name(name, nameRegexp))
            throw new InvalidNameException();

        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setLastName(String lastName)
    {
        if(!Validate.name(lastName, nameRegexp))
            throw new InvalidNameException();

        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setSurname(String surname)
    {
        if(!Validate.name(surname, nameRegexp))
            throw new InvalidNameException();

        this.surname = surname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setNickname(String nickname)
    {
        if(!Validate.name(nickname, nicknameRegexp))
            throw new InvalidNameException();

        this.nickname = nickname;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setEmail(String email)
    {
        if(!email.matches(mailRegexp))
            throw new InvalidNameException();

        this.email = email;
    }

    public String getEmail() { return email; }

    public void setAge(int age)
    {
        if(!Validate.age(age))
            throw new InvalidAgeException();

        this.age = age;
    }

    public int getAge() { return age; }

    public void setGender(String gender)
    {
        if(!Validate.gender(gender))
            throw new InvalidGenderException();

        this.gender = gender;
    }

    public String getGender() { return gender; }

    public abstract void setDesignation(String designation);

    public abstract String getDesignation();

    public abstract void act(String actionType);
}
