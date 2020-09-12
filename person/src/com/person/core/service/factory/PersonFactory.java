package com.person.core.service.factory;

import com.person.core.enumeration.Profession;
import com.person.core.exceptions.NotFoundException;
import com.person.core.model.Singer;
import com.person.core.model.BasePerson;
import com.person.core.model.Dancer;
import com.person.core.model.Programmer;

public class PersonFactory {
    private static int id = 0;

    /**
     * Creates person type by profession.
     * @param profession
     * @return
     */
    public static BasePerson create(Profession profession) {
        if(profession == Profession.DANCER)
            return new Dancer(id++);
        if(profession == Profession.SINGER)
            return new Singer(id++);
        if(profession == Profession.PROGRAMMER)
            return new Programmer(id++);

        throw new NotFoundException("Person not supported!");
    }
}
