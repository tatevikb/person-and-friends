package com.person.core.model;

import com.person.core.enumeration.ActionType;
import com.person.core.enumeration.Profession;
import com.person.core.enumeration.ProgrammerType;
import com.person.core.exceptions.ValidationException;
import com.person.core.service.ProgrammerAction;
import com.person.core.service.impl.PersonActionFactory;

public class Programmer extends BasePerson implements ProgrammerAction {
  private ProgrammerType designation;
  private String companyName;

  public Programmer() 
  {
    actions = PersonActionFactory.getPersonAction(Profession.PROGRAMMER, this);
  }

  /**
   * Set the value of companyName
   * @param companyName the new value of companyName
   */
  public void setCompanyName (String companyName)
  {
    if(name.length() > 255)
      throw new ValidationException("Invalid company name!");

    this.companyName = companyName;
  }

  /**
   * Get the value of companyName
   * @return the value of companyName
   */
  public String getCompanyName () {
    return companyName;
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
  public void setDesignation(String designation) {
    this.designation = ProgrammerType.valueOf(designation);
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
