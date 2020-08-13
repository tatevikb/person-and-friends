package com.person.core.service.factory;

import com.person.core.enumeration.Profession;
import com.person.core.exceptions.NotFoundException;
import com.person.core.model.Singer;
import com.person.core.model.BasePerson;
import com.person.core.model.Dancer;
import com.person.core.model.Programmer;

public class PersonFactory {
    /**
     * Creates person type by profession.
     * @param profession
     * @return
     */
    public static BasePerson create(Profession profession) {
        if(profession == Profession.DANCER)
            return new Dancer();
        if(profession == Profession.SINGER)
            return new Singer();
        if(profession == Profession.PROGRAMMER)
            return new Programmer();

        throw new NotFoundException("Person not supported!");
    }
}
