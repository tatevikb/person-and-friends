package com.person.core.service.utils;

import com.person.core.enumeration.ActionType;
import com.person.core.enumeration.Profession;
import com.person.core.model.BasePerson;
import com.person.core.model.Singer;
import com.person.core.service.DancerAction;
import com.person.core.service.PersonAction;
import com.person.core.service.SingerAction;
import com.person.core.service.factory.PersonActionFactory;

public class SingerExt extends BasePerson implements SingerAction, PersonAction {

 public SingerExt ()
   {
     actions = PersonActionFactory.getPersonAction(Profession.SINGER, this);
   }

    @Override
    public void setDesignation(String designation) {

    }

    @Override
    public String getDesignation() {
        return null;
    }

    @Override
  public void singing() {
      ((SingerAction) actions).singing();
  }

  @Override
  public void playingGuitar() {
      ((SingerAction) actions).playingGuitar();
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
            case SING:
                singing();
                break;
            case PLAY_GUITAR:
                playingGuitar();
                break;
        }
    }

    @Override
    public Profession getProfession()
    {
        return Profession.SINGER;
    }
}
