package com.person.core.service.factory;

import com.person.core.enumeration.Profession;
import com.person.core.exceptions.NotFoundException;
import com.person.core.model.BasePerson;
import com.person.core.service.PersonAction;
import com.person.core.service.impl.DancerActionImpl;
import com.person.core.service.impl.ProgrammerActionImpl;
import com.person.core.service.impl.SingerActionImpl;

public class PersonActionFactory {
    public static PersonAction getPersonAction(Profession profession, BasePerson bp)
    {
        if(profession == Profession.DANCER)
            return new DancerActionImpl(bp);
        else if(profession == Profession.PROGRAMMER)
            return new ProgrammerActionImpl(bp);
        else if(profession == Profession.SINGER)
            return new SingerActionImpl(bp);

        throw new NotFoundException("Person not supported!");
    }
}
