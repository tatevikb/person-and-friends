package com.person.core.service.utils;

import com.person.core.enumeration.ActionType;
import com.person.core.enumeration.Profession;
import com.person.core.model.BasePerson;
import com.person.core.service.PersonAction;
import com.person.core.service.ProgrammerAction;
import com.person.core.service.factory.PersonActionFactory;

public class ProgrammerExt extends BasePerson implements ProgrammerAction, PersonAction {

      public ProgrammerExt()
  {
    actions = PersonActionFactory.getPersonAction(Profession.PROGRAMMER, this);
  }

    @Override
    public void setDesignation(String designation) {

    }

    @Override
    public String getDesignation() {
        return null;
    }

    @Override
  public void coding() {
      ((ProgrammerAction) actions).coding();
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
      case CODE:
        coding();
        break;
    }
  }

  @Override
  public Profession getProfession()
  {
    return Profession.PROGRAMMER;
  }
}
