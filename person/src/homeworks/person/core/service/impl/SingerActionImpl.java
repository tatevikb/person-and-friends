package homeworks.person.core.service.impl;

import homeworks.person.core.model.BasePerson;
import homeworks.person.core.model.Singer;
import homeworks.person.core.service.SingerAction;

public class SingerActionImpl implements SingerAction {

    @Override
    public void learn()
    {
        System.out.println("The singer is learning the lyrics of the song.");
    }

    @Override
    public void eat()
    {
        System.out.println("The singer is eating proteins.");
    }

    @Override
    public void singing()
    {
        System.out.println("The singer is singing a song.");
    }

    @Override
    public void playingGuitar()
    {
        System.out.println("The singer is playing guitar.");
    }
}
