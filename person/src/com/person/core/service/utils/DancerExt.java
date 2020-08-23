package com.person.core.service.utils;

import com.person.core.enumeration.ActionType;
import com.person.core.enumeration.Profession;
import com.person.core.model.BasePerson;
import com.person.core.model.Dancer;
import com.person.core.service.DancerAction;
import com.person.core.service.PersonAction;
import com.person.core.service.factory.PersonActionFactory;

public class DancerExt extends BasePerson implements DancerAction, PersonAction {
     public DancerExt()
     {
         actions = PersonActionFactory.getPersonAction(Profession.DANCER, this);
     }

    @Override
    public void setDesignation(String designation) {

    }

    @Override
    public String getDesignation() {
        return null;
    }

    @Override
    public void dancing() {
        ((DancerAction) actions).dancing();
    }

    @Override
    public void learn() {
        actions.learn();
    }

    @Override
    public void eat() {
        actions.eat();
    }

    @Override
    public void walk() {
        actions.walk();
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

    @Override
    public Profession getProfession()
    {
        return Profession.DANCER;
    }
}
