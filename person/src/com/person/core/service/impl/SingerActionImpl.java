package com.person.core.service.impl;

import com.person.core.enumeration.ActionType;
import com.person.core.model.BasePerson;
import com.person.core.service.SingerAction;

public class SingerActionImpl implements SingerAction {
    private boolean full = false;
    private boolean walked = false;

    private BasePerson actor;

    public SingerActionImpl(BasePerson bp) {
        actor = bp;
    }

    @Override
    public void learn(){
        System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is learning.");
        System.out.println();
    }

    @Override
    public void eat() {
        full = true;
        System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is eating");
        System.out.println();
    }

    @Override
    public void walk() {
        walked = true;
        System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is walking.");
        System.out.println();
    }

    @Override
    /**
     * Checks if singer is full. Singer can sing only after eat.
     */
    public void singing() {
        if(full) {
            System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is singing.");
            System.out.println();
        }
        else System.out.println("She/He hasn't ate, she/he can't sing.");
    }

    @Override
    /**
     * Checks if the singer is out for a walk and full. Singer can play only after walk and eat something.
     */
    public void playingGuitar() {
        if(walked && full) {
            System.out.printf("%s %s", actor.getName(), actor.getSurname()+ " is playing guitar.");
            System.out.println();
        }
        else System.out.println("She/He hasn't walked and ate yet, she/he can't play.");
    }
}
