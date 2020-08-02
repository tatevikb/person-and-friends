package homeworks.person.core.service.impl;

import homeworks.person.core.service.PersonAction;
import homeworks.person.core.service.PersonFactory;

public abstract class PersonFactoryImpl implements PersonFactory {

    @Override
    public PersonAction getPersonAction(String personType)
    {
        if("Dancer".equals(personType))
            return new DancerActionImpl();
        else if("Programmer".equals(personType))
            return new ProgrammerActionImpl();
        else if("Singer".equals(personType))
            return new SingerActionImpl();
        else throw new RuntimeException("Invalid type.");
    }
}
