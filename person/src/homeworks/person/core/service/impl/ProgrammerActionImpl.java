package homeworks.person.core.service.impl;

import homeworks.person.core.service.ProgrammerAction;

public class ProgrammerActionImpl implements ProgrammerAction {

    @Override
    public void learn()
    {
        System.out.println("Programmer can learn only after eating.");
    }

    @Override
    public void eat()
    {
        System.out.println("Programmer can eat unlimited.");
    }

    @Override
    public void walk() { System.out.println("Programmer can walk unlimited."); }

    @Override
    public void coding()
    {
        System.out.println("Programmer can code only after learning.");
    }

}
