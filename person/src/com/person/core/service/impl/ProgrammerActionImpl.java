package com.person.core.service.impl;

import com.person.core.enumeration.ActionType;
import com.person.core.model.BasePerson;
import com.person.core.service.ProgrammerAction;

public class ProgrammerActionImpl implements ProgrammerAction {
    private boolean full = false;
    private boolean learned = false;

    public BasePerson actor;

    public ProgrammerActionImpl(BasePerson bp) {
        actor = bp;
    }

    @Override
    /**
     * Checks, is programmer is full? Programmer can learn only after eating.
     */
    public void learn() {
        if(full) {
            System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is learning.");
            System.out.println();
            learned = true;
        }
        else System.out.println("She/He is not full and can't learn.");
    }

    @Override
    /**
     * Programmer can eat unlimited.
     */
    public void eat() {
        full = true;
        System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is eating.");
        System.out.println();
    }

    @Override
    public void walk() {
        System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is walking.");
        System.out.println();
    }

    @Override
    public void act(String actionType) {
        switch (ActionType.valueOf(actionType.toUpperCase())) {
            case EAT:
                eat();
                break;
            case WALK:
                walk();
                break;
            case LEARN:
                learn();
                break;
            case CODE:
                coding();
                break;
        }
    }

    @Override
    /**
     * Checks, is programmer learned? Programmer can code only after learning
     */
    public void coding() {
        if(learned) {
        System.out.printf("%s %s", actor.getName(), actor.getSurname() + " is writing a code.");
        System.out.println();
    }
    else System.out.println("She/He hasn't learned, she/he can't code.");}

}
