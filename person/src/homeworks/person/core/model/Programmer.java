package homeworks.person.core.model;

import homeworks.person.core.enums.Profession;
import homeworks.person.core.enums.ProgrammerType;
import homeworks.person.core.exceptions.InvalidNameException;
import homeworks.person.core.service.ProgrammerAction;
import homeworks.person.core.service.impl.PersonActionFactory;

public class Programmer extends BasePerson implements ProgrammerAction {
  private ProgrammerType designation;
  private String companyName;

  public Programmer() 
  {
    actions = PersonActionFactory.getPersonAction(Profession.PROGRAMMER);
  }

  /**
   * Set the value of companyName
   * @param companyName the new value of companyName
   */
  public void setCompanyName (String companyName)
  {
    if(name.length() > 255)
      throw new InvalidNameException();

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
}
