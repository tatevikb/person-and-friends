package homeworks.person.core.service.impl;

import homeworks.person.core.service.ProgrammerAction;

public class ProgrammerActionImpl implements ProgrammerAction {

    @Override
    public void learn()
    {
        System.out.println("The programmer is learning Java.");
    }

    @Override
    public void eat()
    {
        System.out.println("The programmer is eating fast food.");
    }

    @Override
    public void coding()
    {
        System.out.println("The programmer is coding.");
    }

}
