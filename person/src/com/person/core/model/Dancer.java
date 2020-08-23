package com.person.core.model;

import com.person.core.enumeration.DancerType;
import com.person.core.enumeration.Profession;
import com.person.core.exceptions.ValidationException;
import com.person.core.service.utils.DancerExt;

public class Dancer extends DancerExt {
    private DancerType designation;
    private String groupName;

    public Dancer(int id)
    {
        this.id = id;
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


    public void setDesignation(String designation) {
      this.designation = DancerType.valueOf(designation);
    }

    public String getDesignation() {
        return designation.toString();
    }

}
