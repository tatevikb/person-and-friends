package com.person.utils;

public class Validate {
    public static boolean name(String name, String rx)
    {
        if(name.length() > 255 || !name.matches(rx))
            return false;

        return true;
    }

    public static boolean gender(String gender)
    {
        return gender.equals("Male") || gender.equals("Female");
    }

    public static boolean age(int age)
    {
        return (age >= 0 && age <= 100);
    }
}
