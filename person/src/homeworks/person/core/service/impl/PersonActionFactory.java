package homeworks.person.core.service.impl;

import homeworks.person.core.enums.Profession;
import homeworks.person.core.exceptions.PersonNotSupportedException;
import homeworks.person.core.service.PersonAction;

public class PersonActionFactory {
    public static PersonAction getPersonAction(Profession profession)
    {
        if(profession == Profession.DANCER)
            return new DancerActionImpl();
        else if(profession == Profession.PROGRAMMER)
            return new ProgrammerActionImpl();
        else if(profession == Profession.SINGER)
            return new SingerActionImpl();

        throw new PersonNotSupportedException();
    }
}
