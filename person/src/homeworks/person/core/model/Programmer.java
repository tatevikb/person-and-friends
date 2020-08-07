package homeworks.person.core.model;

import homeworks.person.core.enums.ActionType;
import homeworks.person.core.enums.Profession;
import homeworks.person.core.enums.ProgrammerType;
import homeworks.person.core.exceptions.InvalidNameException;
import homeworks.person.core.service.ProgrammerAction;
import homeworks.person.core.service.impl.PersonActionFactory;

public class Programmer extends BasePerson implements ProgrammerAction {
  private ProgrammerType designation;
  private String companyName;

  private boolean full = false;
  private boolean learned = false;

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

  /**
   * Checks, is programmer learned? Programmer can code only after learning
   */
  @Override
  public void coding() {
    if(learned) {
      System.out.printf("%s %s", name, surname + " is writing a code.");
      System.out.println();
      ((ProgrammerAction) actions).coding();
    }
    else System.out.println("She/He hasn't learned, she/he can't code.");
  }

  /**
   * Checks, is programmer is full? Programmer can learn only after eating.
   */
  @Override
  public void learn() {
    if(full) {
      System.out.printf("%s %s", name, surname + " is learning.");
      System.out.println();
      actions.learn();
      learned = true;
    }
    else System.out.println("She/He is not full and can't learn.");
  }

  /**
   * Programmer can eat unlimited.
   */
  @Override
  public void eat() {
    full = true;
    System.out.printf("%s %s", name, surname + " is eating.");
    System.out.println();
    actions.eat();
  }

  @Override
  public void walk() {
    System.out.printf("%s %s", name, surname + " is walking.");
    System.out.println();
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
  public void act(String actionType)
  {
    switch (ActionType.valueOf(actionType.toUpperCase())) {
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

}
