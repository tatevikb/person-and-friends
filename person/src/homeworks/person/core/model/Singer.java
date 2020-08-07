package homeworks.person.core.model;

import homeworks.person.core.enums.ActionType;
import homeworks.person.core.enums.Profession;
import homeworks.person.core.enums.SingerType;
import homeworks.person.core.exceptions.InvalidNameException;
import homeworks.person.core.service.SingerAction;
import homeworks.person.core.service.impl.PersonActionFactory;

public class Singer extends BasePerson implements SingerAction {
  private SingerType designation;
  private String bandName;

  private boolean full = false;
  private boolean walked = false;

  public Singer ()
  {
    actions = PersonActionFactory.getPersonAction(Profession.SINGER);
  }

  /**
   * Set the value of bandName
   * @param bandName the new value of bandName
   */
  public void setBandName(String bandName) {

    if(name.length() > 255)
      throw new InvalidNameException();

    this.bandName = bandName;
  }

  /**
   * Get the value of bandName
   * @return the value of bandName
   */
  public String getBandName() {
    return bandName;
  }

  /**
   * Checks if singer is full. Singer can sing only after eat.
   */
  @Override
  public void singing() {
    if(full) {
      System.out.printf("%s %s", name, surname + " is singing.");
      System.out.println();
      ((SingerAction) actions).singing();
    }
    else System.out.println("She/He hasn't ate, she/he can't sing.");
  }

  /**
   * Checks if the singer is out for a walk and full. Singer can play only after walk and eat something.
   */
  @Override
  public void playingGuitar() {
    if(walked && full) {
      System.out.printf("%s %s", name, surname);
      System.out.println();
      ((SingerAction) actions).playingGuitar();
    }
    else System.out.println("She/He hasn't walked and ate yet, she/he can't play.");
  }

  @Override
  public void learn() {
    System.out.printf("%s %s", name, surname + " is learning.");
    System.out.println();
    actions.learn();
  }

  @Override
  public void eat() {
    full = true;
    System.out.printf("%s %s", name, surname + " is eating");
    System.out.println();
    actions.eat();
  }

  @Override
  public void walk() {
    walked = true;
    System.out.printf("%s %s", name, surname + " is walking.");
    System.out.println();
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
      case SING:
        singing();
        break;
      case PLAY_GUITAR:
        playingGuitar();
        break;
    }
  }
}
