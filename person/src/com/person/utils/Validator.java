package com.person.utils;

import com.person.core.enumeration.GenderType;

public class Validator {
    public static boolean names(String name, String rx)
    {
        if(name.length() > 255 || !name.matches(rx))
            return false;

        return true;
    }


    public static boolean gender(GenderType gender)
    {
        return (gender == GenderType.MALE || gender == GenderType.FEMALE);
    }

    public static boolean age(int age)
    {
        return (age >= 0 && age <= 100);
    }
}
