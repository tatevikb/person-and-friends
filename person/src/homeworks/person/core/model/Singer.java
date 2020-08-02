package homeworks.person.core.model;

import homeworks.person.core.enums.Profession;
import homeworks.person.core.enums.SingerType;
import homeworks.person.core.exceptions.InvalidNameException;
import homeworks.person.core.service.SingerAction;
import homeworks.person.core.service.impl.PersonActionFactory;

public class Singer extends BasePerson implements SingerAction {
  private SingerType designation;
  private String bandName;

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
}
