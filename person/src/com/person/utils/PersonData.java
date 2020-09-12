package com.person.utils;

import com.person.core.enumeration.GenderType;
import com.person.core.model.Singer;
import com.person.core.model.BasePerson;
import com.person.core.model.Dancer;
import com.person.core.model.Programmer;

public class PersonData {

    /**
     * Enters personal data.
     * @param person
     */
    public static void input(BasePerson person)
    {
        String name = Input.string("Name");
        if(!name.equals("-"))
            person.setName(name);

        String lastName = Input.string("Last name");
        if(!lastName.equals("-"))
            person.setLastName(lastName);

        String surname = Input.string("Surname");
        if(!surname.equals("-"))
            person.setSurname(surname);

        String nickname = Input.string("Nickname");
        if(!nickname.equals("-"))
            person.setNickname(nickname);

        String designation = Input.string("Designation");
        if(!designation.equals("-"))
            person.setDesignation(designation);

        int age = Input.number("Age");
        if(age != 0)
            person.setAge(age);

        String email = Input.string("E-mail");
        if(!email.equals("-"))
            person.setEmail(email);

        String gender = Input.string("Gender");
        if(!gender.equals("-"))
            person.setGender(gender);

        if (person instanceof Dancer) {
            String groupName = Input.string("Group");
            if(!groupName.equals("-"))
                ((Dancer) person).setGroupName(groupName);
        }

        if (person instanceof Programmer) {
            String companyName = Input.string("Company");
            if(!companyName.equals("-"))
                ((Programmer) person).setCompanyName(companyName);
        }

        if (person instanceof Singer) {
            String bandName = Input.string("Band");
            if(!bandName.equals("-"))
                ((Singer) person).setBandName(bandName);
        }
    }
}
