package homeworks.person.core.service.impl;

import homeworks.person.core.service.SingerAction;

public class SingerActionImpl implements SingerAction {

    @Override
    public void learn()
    {
        System.out.println("Singer can walk unlimited.");
    }

    @Override
    public void eat()
    {
        System.out.println("Singer can eat only after walk.");
    }

    @Override
    public void walk() { System.out.println("Singer can walk unlimited."); }

    @Override
    public void singing()
    {
        System.out.println("Singer can sing only after eat.");
    }

    @Override
    public void playingGuitar()
    {
        System.out.println("Singer can play only after walk.");
    }
}
