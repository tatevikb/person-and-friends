package homeworks.person.core.service.factory;

import homeworks.person.core.enums.Profession;
import homeworks.person.core.exceptions.PersonNotSupportedException;
import homeworks.person.core.model.BasePerson;
import homeworks.person.core.model.Dancer;
import homeworks.person.core.model.Programmer;
import homeworks.person.core.model.Singer;

public class PersonFactory {
    public static BasePerson create(Profession profession) {
        if(profession == Profession.DANCER)
            return new Dancer();
        if(profession == Profession.SINGER)
            return new Singer();
        if(profession == Profession.PROGRAMMER)
            return new Programmer();

        throw new PersonNotSupportedException();
    }
}
