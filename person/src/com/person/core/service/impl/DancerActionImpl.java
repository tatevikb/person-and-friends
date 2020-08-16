package com.person.core.service.impl;

import com.person.core.enumeration.ActionType;
import com.person.core.model.BasePerson;
import com.person.core.service.DancerAction;

public class DancerActionImpl implements DancerAction {
    private boolean full = false;
    private int count = 0;

    public BasePerson actor;

    public DancerActionImpl(BasePerson bp) {
        actor = bp;
    }

    @Override
    public void learn() {
        System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is learning.");
        System.out.println();
    }

    /**
     * Checks, has dancer eaten 3 times in a day or more?
     */
    @Override
    public void eat() {
        if(count < 3) {
            count++;
            full = true;
            System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is eating.");
            System.out.println();
        }
        else {
            System.out.println("She/He has eaten 3 times, she/he can't eat anything else!");
        }
    }

    @Override
    public void walk() {
        System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is walking.");
        System.out.println();
    }

    @Override
    public void act(ActionType actionType) {
        switch (actionType) {
            case EAT:
                eat();
                break;
            case WALK:
                walk();
                break;
            case LEARN:
                learn();
                break;
            case DANCE:
                dancing();
                break;
        }
    }

    /**
     * Checks, is dancer full? Dancer can dancing only after eating.
     */
    @Override
    public void dancing() {
        if(full) {
            System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is dancing.");
            System.out.println();
        }
        else
            System.out.println("She/He is not ate, she/he can't dance.");
    }

}
