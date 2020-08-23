package com.person.core.model;

import com.person.core.enumeration.Profession;
import com.person.core.enumeration.SingerType;
import com.person.core.exceptions.ValidationException;
import com.person.core.service.utils.SingerExt;

public class Singer extends SingerExt {
  private SingerType designation;
  private String bandName;

  public Singer(int id)
  {
    this.id = id;
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
  public void setDesignation(String designation) {
      this.designation = SingerType.valueOf(designation);
  }

  @Override
  public String getDesignation() {
    return designation.toString();
  }

}
