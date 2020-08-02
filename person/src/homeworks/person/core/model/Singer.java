package homeworks.person.core.model;

import homeworks.person.core.service.SingerAction;

public class Singer extends BasePerson implements SingerAction {
  private String bandName;

  public Singer (String name, String designation, String bandName)
  {
    super(name, designation);
    this.bandName = bandName;
  }

  /**
   * Set the value of bandName
   * @param bandName the new value of bandName
   */
  public void setBandName(String bandName) {
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
    System.out.println("practising.");
  }

  @Override
  public void playingGuitar() {
    System.out.println("playing guitar.");
  }
}
