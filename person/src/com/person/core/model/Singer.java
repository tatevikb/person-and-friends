package com.person.core.model;

import com.person.core.enumeration.ActionType;
import com.person.core.enumeration.Profession;
import com.person.core.enumeration.SingerType;
import com.person.core.exceptions.ValidationException;
import com.person.core.service.SingerAction;
import com.person.core.service.impl.PersonActionFactory;

public class Singer extends BasePerson implements SingerAction {
  private SingerType designation;
  private String bandName;

  public Singer ()
  {
    actions = PersonActionFactory.getPersonAction(Profession.SINGER, this);
  }

  /**
   * Set the value of bandName
   * @param bandName the new value of bandName
   */
  public void setBandName(String bandName) {

    if(name.length() > 255)
      throw new ValidationException("Invalid band name!");

    this.bandName = bandName;
  }

  /**
   * Get the value of bandName
   * @return the value of bandName
   */
  public String getBandName() {
    return bandName;
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
  public void setDesignation(String designation) {
      this.designation = SingerType.valueOf(designation);
  }

  @Override
  public String getDesignation() {
    return designation.toString();
  }

  @Override
  public void act(ActionType actionType)
  {
    actions.act(actionType);
  }
}
