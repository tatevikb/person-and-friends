package com.person.core.model;


import com.person.core.enumeration.Profession;
import com.person.core.enumeration.ProgrammerType;
import com.person.core.exceptions.ValidationException;
import com.person.core.service.utils.ProgrammerExt;

public class Programmer extends ProgrammerExt {
  private ProgrammerType designation;
  private String companyName;

  public Programmer(int id)
  {
    this.id = id;
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
  public void setDesignation(String designation) {
    this.designation = ProgrammerType.valueOf(designation);
  }

  @Override
  public String getDesignation() {
    return designation.toString();
  }

}
