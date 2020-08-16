package com.person.core.model;

import com.person.core.enumeration.ActionType;
import com.person.core.enumeration.DancerType;
import com.person.core.enumeration.Profession;
import com.person.core.exceptions.ValidationException;
import com.person.core.service.DancerAction;
import com.person.core.service.impl.PersonActionFactory;

public class Dancer extends BasePerson implements DancerAction {
    private DancerType designation;
    private String groupName;

    public Dancer()
    {
        actions = PersonActionFactory.getPersonAction(Profession.DANCER, this);
    }

    /**
     * Set the value of groupName
     * @param groupName the new value of groupName
     */
    public void setGroupName(String groupName)
    {
        if(name.length() > 255)
            throw new ValidationException("Invalid group name!");

        this.groupName = groupName;
    }

  /**
   * Get the value of groupName
   * @return the value of groupName
   */
  public String getGroupName() {
    return groupName;
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
    public void setDesignation(String designation) {
      this.designation = DancerType.valueOf(designation);
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
